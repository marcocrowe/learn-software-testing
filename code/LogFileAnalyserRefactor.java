// package io.github.marcocrowe.crosscutting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.filechooser.FileSystemView;

public class LogFileAnalyserRefactor
{
    private final LogFileManager fileManager;

    public LogFileAnalyserRefactor(LogFileManager fileManager)
    {
        this.fileManager = fileManager;
    }

    private Boolean lastLogFileStatus = null;
    private String path = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\Logs\\";

    public Boolean analyseLogfile(String fileName)
    {
        // First piece of business logic is to check that the Logfile has a valid extension. Unit tests need to test this.
        if (!fileName.endsWith(".log"))
            return false; //LogFile extension 1a invalid

        // Next open the Log file and rend the log status
        String readMeText;
        String status = fileManager.getStatus();

        // The status is read from the log file. Next is the business logic to determine if the status is a crash or not
        if (status.equals("Normal Log"))
        {
            lastLogFileStatus = true;
            return true;
        }
        else
        {
            if(status.equals("Monitored system crashed"))
            {
                lastLogFileStatus = false;
                return false;
            }
            else
            {
                return false;
            }
        }
    }
}

interface LogFileManager
{
    public String getStatus();
}

class LogFileManagerImpl implements LogFileManager
{
    private String fileName;
    public LogFileManagerImpl(String fileName){}

    public String getStatus()
    {
        String status = null;
        try{
            // Read the log file
            System.out.println("Reading actual log file on disk -- > You should not be seeing this from Unit tests");
            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader (file));
            String readMeText = br.readLine();
            if (readMeText.contains("Exception"))
                status = "Monitored system crashed"; //As the word Exception was in the log file
            else //anything else in the log is a normal log
                status = "Normal Log";
            br.close();
            file.delete(); // Delete the log file as I don't want to process it again
        }
        catch (Exception e)
        {
            e.printStackTrace ();
            System.out.println ("You must pick Option 1. or Option 2 before you pick Option 3. Run the Simulator again! \n");
            System.exit (0);
        }
        return status;
    }
}

/**
 * InnerLogFileAnalyser
 */
class ValidLogFileManagerStub implements LogFileManager {
    public String getStatus() {
        return "Normal Log";
    }
}

class InvalidLogFileManagerStub implements LogFileManager {
    public String getStatus() {
        return "Monitored system crashed";
    }
}

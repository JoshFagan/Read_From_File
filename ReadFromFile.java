import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFromFile
{
    public static void main( String[] args )
    {
        String file_name = "";

        if (args.length > 0)
        {
            file_name = args[0];
        }
        else
        {
            System.err.println( "Need to include name of text file in execution" );
        }
        ReadFromFile rff = new ReadFromFile();
        rff.readFile( file_name );
    }

    public ReadFromFile()
    {
    }

    private void readFile( String file )
    {
        try
        {
            Scanner fileScanner = new Scanner( new File( file ) );
            while ( fileScanner.hasNextInt() )
            {
                System.out.println( fileScanner.nextInt() );
            }
        }
        catch ( FileNotFoundException e )
        {
            System.err.println( "FileNotFoundException: " + e.getMessage() );
        }
    }
}

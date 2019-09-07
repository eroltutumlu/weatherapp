package core;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Logger implements ILog{
	
    private static volatile Logger instance;
    private static final String TXTFILE = "RequestResponse.txt";

    private Logger() {}

    public static Logger getInstance() {
        if(instance == null) {
            synchronized (Logger.class) {
                // double-check
                if(instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

	public void logToTxtFile(String request, String response) {
		try (PrintWriter out = new PrintWriter(TXTFILE)) {
			System.out.println(request);
			StringBuilder stringBuilder = new StringBuilder()
					.append("Request")
					.append(System.getProperty("line.separator"))
					.append(System.getProperty("line.separator"))
					.append(request)
					.append(System.getProperty("line.separator"))
					.append(System.getProperty("line.separator"))
					.append("Response")
					.append(System.getProperty("line.separator"))
					.append(System.getProperty("line.separator"))
					.append(response);
		    out.println(stringBuilder);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void logToPdfDocument(String request, String response) {
		// https://www.mkyong.com/java/itext-read-and-write-pdf-in-java/
	}	
	
	
}

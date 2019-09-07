package core;

public interface ILog {
	void logToTxtFile(String request, String response);
	void logToPdfDocument(String request, String response);
}
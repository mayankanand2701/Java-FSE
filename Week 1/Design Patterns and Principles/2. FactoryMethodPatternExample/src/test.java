// Step 5
public class test
{
	public static void main(String[] args)
	{
		DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        
        wordFactory.createDocument();
        pdfFactory.createDocument();
        excelFactory.createDocument();
	}
}

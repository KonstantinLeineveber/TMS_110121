import java.io.*;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class Runner {
    public static void main(String[] args) {

        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        String fileName = "d:/tms/TMS_110121/lesson16/src/Computer.xml";
        String schemaName = "d:/tms/TMS_110121/lesson16/src/Computer.xsd";
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(schemaName);
        try {
            Schema schema = factory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(fileName);
            validator.validate(source);
            System.out.println(fileName + " is valid.");
        } catch (org.xml.sax.SAXException e) {
            System.err.print("validation " + fileName + " is not valid because "
                    + e.getMessage());
        } catch (IOException e) {
            System.err.print(fileName + " is not valid because "
                    + e.getMessage());
        }

    }
}

import org.docx4j.jaxb.Context;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.wml.ObjectFactory;

import java.io.File;

/**
 * Created by daniel on 18.04.14.
 */
public class TableDocument {
    public WordprocessingMLPackage pack;
    public ObjectFactory factory;

    public TableDocument()
    {
        try
        {
            pack = WordprocessingMLPackage.createPackage();
            factory = Context.getWmlObjectFactory();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void addTable(TableDocumentTable table)
    {
        table.createTable(this);
    }

    public void save(File file)
    {
        try
        {
            pack.save(file);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

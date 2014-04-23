import org.docx4j.jaxb.Context;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.StyleDefinitionsPart;
import org.docx4j.wml.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 18.04.14.
 */
public class ManClass {

    public static void main(String[] args)
    {

        TableDocument doc = new TableDocument();

        TableDocumentUtils.printDefinedStyles(doc);

        TableDocumentTable table = new TableDocumentTable();

        ArrayList<String> rel1 = new ArrayList<String>() {
            {
                add(null); add("11"); add("12"); add("13"); add("14"); add("15");
            }
        };
        ArrayList<String> rel2 = new ArrayList<String>() {
            {
                add(null); add("21"); add("22"); add("23"); add("24"); add("25");
            }
        };

        table.addRelation(rel1);
        table.addRelation(rel2);

        doc.addTable(table);
        doc.addTable(table);
        doc.save(new File("/Users/daniel/Desktop/firsttry.docx"));

    }

}

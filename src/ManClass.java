import java.io.File;
import java.util.ArrayList;

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


        TableDocumentIndividual itable = new TableDocumentIndividual();

        ArrayList<String> attr = new ArrayList<String>() {
            {
                add(null); add("hatX"); add("Auto");
            }
        };

        itable.addRelation(attr);
        doc.addIndividual(itable);

        doc.save(new File("/Users/daniel/Desktop/firsttry.docx"));

    }

}

import org.docx4j.openpackaging.parts.WordprocessingML.StyleDefinitionsPart;
import org.docx4j.wml.Style;
import org.docx4j.wml.Styles;

import java.util.List;

/**
 * Created by daniel on 18.04.14.
 */
public class TableDocumentUtils {

    public static void printDefinedStyles(TableDocument doc)
    {
        StyleDefinitionsPart styleDefinitionsPart =
                doc.pack.getMainDocumentPart().getStyleDefinitionsPart();
        Styles styles = styleDefinitionsPart.getJaxbElement();

        List<Style> stylesList = styles.getStyle();
        for (Style style : stylesList) {
            System.out.println(style.getStyleId());
        }
    }
}

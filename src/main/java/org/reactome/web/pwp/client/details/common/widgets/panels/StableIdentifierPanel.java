package org.reactome.web.pwp.client.details.common.widgets.panels;

import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import org.reactome.web.pwp.model.classes.DatabaseObject;
import org.reactome.web.pwp.model.classes.StableIdentifier;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public class StableIdentifierPanel extends DetailsPanel implements TransparentPanel {
    private  StableIdentifier stableIdentifier;

    public StableIdentifierPanel(StableIdentifier stableIdentifier) {
        this(null, stableIdentifier);
    }

    public StableIdentifierPanel(DetailsPanel parentPanel, StableIdentifier stableIdentifier) {
        super(parentPanel);
        this.stableIdentifier = stableIdentifier;
        initialize();
    }

    private void initialize(){
        String identifier = stableIdentifier.getDisplayName();

        HorizontalPanel hp = new HorizontalPanel();
        hp.getElement().getStyle().setMarginBottom(10, Style.Unit.PX);

        Label title = new Label(identifier);
        Style titleStyle = title.getElement().getStyle();
        titleStyle.setFontWeight(Style.FontWeight.NORMAL);
        titleStyle.setMarginRight(5, Style.Unit.PX);
        //hp.add(title);
        //hp.add(new HTMLPanel(sb.toString()));

        //Anchor link = new Anchor(identifier, "/cgi-bin/control_panel_st_id?ST_ID=" + identifier);
        //link.setTarget("_blank");
        //link.setTitle("Go to REACTOME control panel for " + identifier);
        //initWidget(link);
        initWidget(title);
    }

    @Override
    public DatabaseObject getDatabaseObject() {
        return this.stableIdentifier;
    }
}

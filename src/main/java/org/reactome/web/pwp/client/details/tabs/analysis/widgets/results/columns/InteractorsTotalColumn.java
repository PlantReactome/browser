package org.reactome.web.pwp.client.details.tabs.analysis.widgets.results.columns;

import com.google.gwt.cell.client.NumberCell;
import org.reactome.web.analysis.client.model.PathwaySummary;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public class InteractorsTotalColumn extends AbstractColumn<Number> {

    private static final String explanation = "The total number of identifiers that match to interactors for entities in the pathway for the selected molecular type";

    public InteractorsTotalColumn() {
        super(new NumberCell(), "Interactors", "Total", explanation);
        setWidth(76);
    }

    @Override
    public Number getValue(PathwaySummary object) {
        if (object == null) return null;
        return object.getEntities().getInteractorsTotal();
    }
}

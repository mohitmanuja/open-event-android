package org.fossasia.openevent.views.stickyheadersrecyclerview.util;

import android.support.v7.widget.RecyclerView;

/**
 * User: Shailesh Baldaniya
 * Date: 13-03-17
 * <p/>
 * Interface for getting the orientation of a RecyclerView from its LayoutManager
 */
public interface OrientationProvider {

    public int getOrientation(RecyclerView recyclerView);

    public boolean isReverseLayout(RecyclerView recyclerView);
}

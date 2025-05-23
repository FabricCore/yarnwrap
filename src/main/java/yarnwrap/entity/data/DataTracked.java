package yarnwrap.entity.data;
public class DataTracked { public net.minecraft.entity.data.DataTracked wrapperContained; public DataTracked(net.minecraft.entity.data.DataTracked wrapperContained) { this.wrapperContained = wrapperContained; }

public void onTrackedDataSet(yarnwrap.entity.data.TrackedData data) { wrapperContained.onTrackedDataSet(data.wrapperContained); }
// public static void onTrackedDataSet(yarnwrap.entity.data.TrackedData data, ) { net.minecraft.entity.data.DataTracked.onTrackedDataSet(data.wrapperContained); }
public void onDataTrackerUpdate(java.util.List entries) { wrapperContained.onDataTrackerUpdate(entries); }
// public static void onDataTrackerUpdate(java.util.List entries, ) { net.minecraft.entity.data.DataTracked.onDataTrackerUpdate(entries); }

}
package yarnwrap.entity.data;
public class DataTracker { public net.minecraft.entity.data.DataTracker wrapperContained; public DataTracker(net.minecraft.entity.data.DataTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean dirty() { return wrapperContained.dirty; }
// public Object entries() { return wrapperContained.entries; }
// public yarnwrap.entity.data.DataTracked trackedEntity() { return new yarnwrap.entity.data.DataTracked(wrapperContained.trackedEntity); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int MAX_DATA_VALUE_ID() { return wrapperContained.MAX_DATA_VALUE_ID; }
// public yarnwrap.util.collection.Class2IntMap CLASS_TO_LAST_ID() { return new yarnwrap.util.collection.Class2IntMap(wrapperContained.CLASS_TO_LAST_ID); }
public void set(yarnwrap.entity.data.TrackedData key,java.lang.Object value) { wrapperContained.set(key.wrapperContained,value); }
public void writeUpdatedEntries(java.util.List entries) { wrapperContained.writeUpdatedEntries(entries); }
public java.util.List getDirtyEntries() { return wrapperContained.getDirtyEntries(); }
// public Object getEntry(yarnwrap.entity.data.TrackedData key) { return wrapperContained.getEntry(key.wrapperContained); }
// public void copyToFrom(Object to,Object from) { wrapperContained.copyToFrom(to,from); }
public boolean isDirty() { return wrapperContained.isDirty(); }
public java.lang.Object get(yarnwrap.entity.data.TrackedData data) { return wrapperContained.get(data.wrapperContained); }
public yarnwrap.entity.data.TrackedData registerData(java.lang.Class entityClass,yarnwrap.entity.data.TrackedDataHandler dataHandler) { return new yarnwrap.entity.data.TrackedData(wrapperContained.registerData(entityClass,dataHandler.wrapperContained)); }
public java.util.List getChangedEntries() { return wrapperContained.getChangedEntries(); }
public void set(yarnwrap.entity.data.TrackedData key,java.lang.Object value,boolean force) { wrapperContained.set(key.wrapperContained,value,force); }

}
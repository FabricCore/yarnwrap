package yarnwrap.entity.data;
public class DataTracker { public net.minecraft.entity.data.DataTracker wrapperContained; public DataTracker(net.minecraft.entity.data.DataTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean dirty() { return wrapperContained.dirty; }
// public void dirty(boolean value) { wrapperContained.dirty = value; }
// public static boolean dirty() { return net.minecraft.entity.data.DataTracker.dirty; }
// public static void dirty(boolean value, ) { net.minecraft.entity.data.DataTracker.dirty = value; }

// public Object entries() { return wrapperContained.entries; }
// // public void entries(Object value) { wrapperContained.entries = value; }
// // public static Object entries() { return net.minecraft.entity.data.DataTracker.entries; }
// // public static void entries(Object value, ) { net.minecraft.entity.data.DataTracker.entries = value; }

// public yarnwrap.entity.data.DataTracked trackedEntity() { return new yarnwrap.entity.data.DataTracked(wrapperContained.trackedEntity); }
// public void trackedEntity(yarnwrap.entity.data.DataTracked value) { wrapperContained.trackedEntity = value.wrapperContained; }
// public static yarnwrap.entity.data.DataTracked trackedEntity() { return new yarnwrap.entity.data.DataTracked(net.minecraft.entity.data.DataTracker.trackedEntity); }
// public static void trackedEntity(yarnwrap.entity.data.DataTracked value, ) { net.minecraft.entity.data.DataTracker.trackedEntity = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.data.DataTracker.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.data.DataTracker.LOGGER = value; }

// public int MAX_DATA_VALUE_ID() { return wrapperContained.MAX_DATA_VALUE_ID; }
// public void MAX_DATA_VALUE_ID(int value) { wrapperContained.MAX_DATA_VALUE_ID = value; }
// public static int MAX_DATA_VALUE_ID() { return net.minecraft.entity.data.DataTracker.MAX_DATA_VALUE_ID; }
// public static void MAX_DATA_VALUE_ID(int value, ) { net.minecraft.entity.data.DataTracker.MAX_DATA_VALUE_ID = value; }

// public yarnwrap.util.collection.Class2IntMap CLASS_TO_LAST_ID() { return new yarnwrap.util.collection.Class2IntMap(wrapperContained.CLASS_TO_LAST_ID); }
// public void CLASS_TO_LAST_ID(yarnwrap.util.collection.Class2IntMap value) { wrapperContained.CLASS_TO_LAST_ID = value.wrapperContained; }
// public static yarnwrap.util.collection.Class2IntMap CLASS_TO_LAST_ID() { return new yarnwrap.util.collection.Class2IntMap(net.minecraft.entity.data.DataTracker.CLASS_TO_LAST_ID); }
// public static void CLASS_TO_LAST_ID(yarnwrap.util.collection.Class2IntMap value, ) { net.minecraft.entity.data.DataTracker.CLASS_TO_LAST_ID = value.wrapperContained; }

// public DataTracker(yarnwrap.entity.data.DataTracked trackedEntity,Object[] entries) { this.wrapperContained = new net.minecraft.entity.data.DataTracker(trackedEntity.wrapperContained,entries); }
public void set(yarnwrap.entity.data.TrackedData key,java.lang.Object value) { wrapperContained.set(key.wrapperContained,value); }
// public static void set(yarnwrap.entity.data.TrackedData key,java.lang.Object value, ) { net.minecraft.entity.data.DataTracker.set(key.wrapperContained,value); }
public void writeUpdatedEntries(java.util.List entries) { wrapperContained.writeUpdatedEntries(entries); }
// public static void writeUpdatedEntries(java.util.List entries, ) { net.minecraft.entity.data.DataTracker.writeUpdatedEntries(entries); }
public java.util.List getDirtyEntries() { return wrapperContained.getDirtyEntries(); }
// public static java.util.List getDirtyEntries() { return net.minecraft.entity.data.DataTracker.getDirtyEntries(); }
// public Object getEntry(yarnwrap.entity.data.TrackedData key) { return wrapperContained.getEntry(key.wrapperContained); }
// public static Object getEntry(yarnwrap.entity.data.TrackedData key, ) { return net.minecraft.entity.data.DataTracker.getEntry(key.wrapperContained); }
// public void copyToFrom(Object to,Object from) { wrapperContained.copyToFrom(to,from); }
// public static void copyToFrom(Object to,Object from, ) { net.minecraft.entity.data.DataTracker.copyToFrom(to,from); }
public boolean isDirty() { return wrapperContained.isDirty(); }
// public static boolean isDirty() { return net.minecraft.entity.data.DataTracker.isDirty(); }
public java.lang.Object get(yarnwrap.entity.data.TrackedData data) { return wrapperContained.get(data.wrapperContained); }
// public static java.lang.Object get(yarnwrap.entity.data.TrackedData data, ) { return net.minecraft.entity.data.DataTracker.get(data.wrapperContained); }
// public yarnwrap.entity.data.TrackedData registerData(java.lang.Class entityClass,yarnwrap.entity.data.TrackedDataHandler dataHandler) { return new yarnwrap.entity.data.TrackedData(wrapperContained.registerData(entityClass,dataHandler.wrapperContained)); }
// public static yarnwrap.entity.data.TrackedData registerData(java.lang.Class entityClass,yarnwrap.entity.data.TrackedDataHandler dataHandler, ) { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.data.DataTracker.registerData(entityClass,dataHandler.wrapperContained)); }
public java.util.List getChangedEntries() { return wrapperContained.getChangedEntries(); }
// public static java.util.List getChangedEntries() { return net.minecraft.entity.data.DataTracker.getChangedEntries(); }
public void set(yarnwrap.entity.data.TrackedData key,java.lang.Object value,boolean force) { wrapperContained.set(key.wrapperContained,value,force); }
// public static void set(yarnwrap.entity.data.TrackedData key,java.lang.Object value,boolean force, ) { net.minecraft.entity.data.DataTracker.set(key.wrapperContained,value,force); }

}
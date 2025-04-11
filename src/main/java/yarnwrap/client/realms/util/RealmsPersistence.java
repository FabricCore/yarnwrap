package yarnwrap.client.realms.util;
public class RealmsPersistence { public net.minecraft.client.realms.util.RealmsPersistence wrapperContained; public RealmsPersistence(net.minecraft.client.realms.util.RealmsPersistence wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.CheckedGson CHECKED_GSON() { return new yarnwrap.client.realms.CheckedGson(wrapperContained.CHECKED_GSON); }
// public void CHECKED_GSON(yarnwrap.client.realms.CheckedGson value) { wrapperContained.CHECKED_GSON = value.wrapperContained; }
// public java.lang.String FILE_NAME() { return wrapperContained.FILE_NAME; }
// public void FILE_NAME(java.lang.String value) { wrapperContained.FILE_NAME = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public Object readFile() { return wrapperContained.readFile(); }
// public void writeFile(Object data) { wrapperContained.writeFile(data); }
// public java.nio.file.Path getFile() { return wrapperContained.getFile(); }
public Object load() { return wrapperContained.load(); }
// public void save(Object data) { wrapperContained.save(data); }

}
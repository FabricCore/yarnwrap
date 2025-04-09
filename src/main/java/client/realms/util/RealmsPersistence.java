package yarnwrap.client.realms.util;
public class RealmsPersistence { public net.minecraft.client.realms.util.RealmsPersistence wrapperContained; public RealmsPersistence(net.minecraft.client.realms.util.RealmsPersistence wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.CheckedGson CHECKED_GSON() { return new yarnwrap.client.realms.CheckedGson(wrapperContained.CHECKED_GSON); }
// public java.lang.String FILE_NAME() { return wrapperContained.FILE_NAME; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public Object readFile() { return wrapperContained.readFile(); }
// public void writeFile(Object data) { wrapperContained.writeFile(data); }
// public java.nio.file.Path getFile() { return wrapperContained.getFile(); }
public Object load() { return wrapperContained.load(); }
// public void save(Object data) { wrapperContained.save(data); }

}
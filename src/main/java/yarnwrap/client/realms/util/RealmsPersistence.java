package yarnwrap.client.realms.util;
public class RealmsPersistence { public net.minecraft.client.realms.util.RealmsPersistence wrapperContained; public RealmsPersistence(net.minecraft.client.realms.util.RealmsPersistence wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.CheckedGson CHECKED_GSON() { return new yarnwrap.client.realms.CheckedGson(wrapperContained.CHECKED_GSON); }
// public void CHECKED_GSON(yarnwrap.client.realms.CheckedGson value) { wrapperContained.CHECKED_GSON = value.wrapperContained; }
// public static yarnwrap.client.realms.CheckedGson CHECKED_GSON() { return new yarnwrap.client.realms.CheckedGson(net.minecraft.client.realms.util.RealmsPersistence.CHECKED_GSON); }
// public static void CHECKED_GSON(yarnwrap.client.realms.CheckedGson value, ) { net.minecraft.client.realms.util.RealmsPersistence.CHECKED_GSON = value.wrapperContained; }

// public java.lang.String FILE_NAME() { return wrapperContained.FILE_NAME; }
// public void FILE_NAME(java.lang.String value) { wrapperContained.FILE_NAME = value; }
// public static java.lang.String FILE_NAME() { return net.minecraft.client.realms.util.RealmsPersistence.FILE_NAME; }
// public static void FILE_NAME(java.lang.String value, ) { net.minecraft.client.realms.util.RealmsPersistence.FILE_NAME = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.util.RealmsPersistence.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.util.RealmsPersistence.LOGGER = value; }

// public Object readFile() { return wrapperContained.readFile(); }
public static Object readFile() { return net.minecraft.client.realms.util.RealmsPersistence.readFile(); }
// public void writeFile(Object data) { wrapperContained.writeFile(data); }
// public static void writeFile(Object data, ) { net.minecraft.client.realms.util.RealmsPersistence.writeFile(data); }
// public java.nio.file.Path getFile() { return wrapperContained.getFile(); }
// public static java.nio.file.Path getFile() { return net.minecraft.client.realms.util.RealmsPersistence.getFile(); }
public Object load() { return wrapperContained.load(); }
// public static Object load() { return net.minecraft.client.realms.util.RealmsPersistence.load(); }
// public void save(Object data) { wrapperContained.save(data); }
// public static void save(Object data, ) { net.minecraft.client.realms.util.RealmsPersistence.save(data); }

}
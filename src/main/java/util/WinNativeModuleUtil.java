package yarnwrap.util;
public class WinNativeModuleUtil { public net.minecraft.util.WinNativeModuleUtil wrapperContained; public WinNativeModuleUtil(net.minecraft.util.WinNativeModuleUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int CODE_PAGE_MASK() { return wrapperContained.CODE_PAGE_MASK; }
// public int EN_US_CODE_PAGE() { return wrapperContained.EN_US_CODE_PAGE; }
// public int LANGUAGE_ID_MASK() { return wrapperContained.LANGUAGE_ID_MASK; }
// public int LANGUAGE_ID() { return wrapperContained.LANGUAGE_ID; }
public java.util.List collectNativeModules() { return wrapperContained.collectNativeModules(); }
// public com.sun.jna.Pointer query(com.sun.jna.Pointer pointer,java.lang.String path,com.sun.jna.ptr.IntByReference lengthPointer) { return wrapperContained.query(pointer,path,lengthPointer); }
// public java.util.Optional createNativeModuleInfo(java.lang.String path) { return wrapperContained.createNativeModuleInfo(path); }
// public java.lang.String getStringFileInfoPath(java.lang.String key,int languageId,int codePage) { return wrapperContained.getStringFileInfoPath(key,languageId,codePage); }
public void addDetailTo(yarnwrap.util.crash.CrashReportSection section) { wrapperContained.addDetailTo(section.wrapperContained); }
// public java.util.OptionalInt getEnglishTranslationIndex(int indices) { return wrapperContained.getEnglishTranslationIndex(indices); }
// public java.lang.String queryString(com.sun.jna.Pointer pointer,java.lang.String path,com.sun.jna.ptr.IntByReference lengthPointer) { return wrapperContained.queryString(pointer,path,lengthPointer); }

}
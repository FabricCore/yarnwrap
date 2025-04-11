package yarnwrap.util;
public class WinNativeModuleUtil { public net.minecraft.util.WinNativeModuleUtil wrapperContained; public WinNativeModuleUtil(net.minecraft.util.WinNativeModuleUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int CODE_PAGE_MASK() { return wrapperContained.CODE_PAGE_MASK; }
// public void CODE_PAGE_MASK(int value) { wrapperContained.CODE_PAGE_MASK = value; }
// public int EN_US_CODE_PAGE() { return wrapperContained.EN_US_CODE_PAGE; }
// public void EN_US_CODE_PAGE(int value) { wrapperContained.EN_US_CODE_PAGE = value; }
// public int LANGUAGE_ID_MASK() { return wrapperContained.LANGUAGE_ID_MASK; }
// public void LANGUAGE_ID_MASK(int value) { wrapperContained.LANGUAGE_ID_MASK = value; }
// public int LANGUAGE_ID() { return wrapperContained.LANGUAGE_ID; }
// public void LANGUAGE_ID(int value) { wrapperContained.LANGUAGE_ID = value; }
public java.util.List collectNativeModules() { return wrapperContained.collectNativeModules(); }
// public java.lang.String method_37962(Object moduleName) { return wrapperContained.method_37962(moduleName); }
// public com.sun.jna.Pointer query(com.sun.jna.Pointer pointer,java.lang.String path,com.sun.jna.ptr.IntByReference lengthPointer) { return wrapperContained.query(pointer,path,lengthPointer); }
// public java.util.Optional createNativeModuleInfo(java.lang.String path) { return wrapperContained.createNativeModuleInfo(path); }
// public java.lang.String getStringFileInfoPath(java.lang.String key,int languageId,int codePage) { return wrapperContained.getStringFileInfoPath(key,languageId,codePage); }
public void addDetailTo(yarnwrap.util.crash.CrashReportSection section) { wrapperContained.addDetailTo(section.wrapperContained); }
// public java.util.OptionalInt getEnglishTranslationIndex(int indices) { return wrapperContained.getEnglishTranslationIndex(indices); }
// public java.lang.String method_37969(Object module) { return wrapperContained.method_37969(module); }
// public java.lang.String queryString(com.sun.jna.Pointer pointer,java.lang.String path,com.sun.jna.ptr.IntByReference lengthPointer) { return wrapperContained.queryString(pointer,path,lengthPointer); }

}
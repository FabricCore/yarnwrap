package yarnwrap.client.resource;
public class VideoWarningManager { public net.minecraft.client.resource.VideoWarningManager wrapperContained; public VideoWarningManager(net.minecraft.client.resource.VideoWarningManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier GPU_WARNLIST_ID() { return new yarnwrap.util.Identifier(wrapperContained.GPU_WARNLIST_ID); }
// public void GPU_WARNLIST_ID(yarnwrap.util.Identifier value) { wrapperContained.GPU_WARNLIST_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier GPU_WARNLIST_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.resource.VideoWarningManager.GPU_WARNLIST_ID); }
// public static void GPU_WARNLIST_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.resource.VideoWarningManager.GPU_WARNLIST_ID = value.wrapperContained; }

// public com.google.common.collect.ImmutableMap warnings() { return wrapperContained.warnings; }
// public void warnings(com.google.common.collect.ImmutableMap value) { wrapperContained.warnings = value; }
// public static com.google.common.collect.ImmutableMap warnings() { return net.minecraft.client.resource.VideoWarningManager.warnings; }
// public static void warnings(com.google.common.collect.ImmutableMap value, ) { net.minecraft.client.resource.VideoWarningManager.warnings = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.resource.VideoWarningManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.resource.VideoWarningManager.LOGGER = value; }

// public boolean warningScheduled() { return wrapperContained.warningScheduled; }
// public void warningScheduled(boolean value) { wrapperContained.warningScheduled = value; }
// public static boolean warningScheduled() { return net.minecraft.client.resource.VideoWarningManager.warningScheduled; }
// public static void warningScheduled(boolean value, ) { net.minecraft.client.resource.VideoWarningManager.warningScheduled = value; }

// public boolean warned() { return wrapperContained.warned; }
// public void warned(boolean value) { wrapperContained.warned = value; }
// public static boolean warned() { return net.minecraft.client.resource.VideoWarningManager.warned; }
// public static void warned(boolean value, ) { net.minecraft.client.resource.VideoWarningManager.warned = value; }

// public boolean cancelledAfterWarning() { return wrapperContained.cancelledAfterWarning; }
// public void cancelledAfterWarning(boolean value) { wrapperContained.cancelledAfterWarning = value; }
// public static boolean cancelledAfterWarning() { return net.minecraft.client.resource.VideoWarningManager.cancelledAfterWarning; }
// public static void cancelledAfterWarning(boolean value, ) { net.minecraft.client.resource.VideoWarningManager.cancelledAfterWarning = value; }

public boolean hasWarning() { return wrapperContained.hasWarning(); }
// public static boolean hasWarning() { return net.minecraft.client.resource.VideoWarningManager.hasWarning(); }
// public void compilePatterns(com.google.gson.JsonArray array,java.util.List patterns) { wrapperContained.compilePatterns(array,patterns); }
// public static void compilePatterns(com.google.gson.JsonArray array,java.util.List patterns, ) { net.minecraft.client.resource.VideoWarningManager.compilePatterns(array,patterns); }
// public void method_30059(java.util.List json) { wrapperContained.method_30059(json); }
// public static void method_30059(java.util.List json, ) { net.minecraft.client.resource.VideoWarningManager.method_30059(json); }
public java.lang.String getRendererWarning() { return wrapperContained.getRendererWarning(); }
// public static java.lang.String getRendererWarning() { return net.minecraft.client.resource.VideoWarningManager.getRendererWarning(); }
// public com.google.gson.JsonObject loadWarnlist(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.profiler.Profiler profiler) { return wrapperContained.loadWarnlist(resourceManager.wrapperContained,profiler.wrapperContained); }
// public static com.google.gson.JsonObject loadWarnlist(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.profiler.Profiler profiler, ) { return net.minecraft.client.resource.VideoWarningManager.loadWarnlist(resourceManager.wrapperContained,profiler.wrapperContained); }
public java.lang.String getVersionWarning() { return wrapperContained.getVersionWarning(); }
// public static java.lang.String getVersionWarning() { return net.minecraft.client.resource.VideoWarningManager.getVersionWarning(); }
public java.lang.String getVendorWarning() { return wrapperContained.getVendorWarning(); }
// public static java.lang.String getVendorWarning() { return net.minecraft.client.resource.VideoWarningManager.getVendorWarning(); }
public boolean canWarn() { return wrapperContained.canWarn(); }
// public static boolean canWarn() { return net.minecraft.client.resource.VideoWarningManager.canWarn(); }
public void scheduleWarning() { wrapperContained.scheduleWarning(); }
// public static void scheduleWarning() { net.minecraft.client.resource.VideoWarningManager.scheduleWarning(); }
public void acceptAfterWarnings() { wrapperContained.acceptAfterWarnings(); }
// public static void acceptAfterWarnings() { net.minecraft.client.resource.VideoWarningManager.acceptAfterWarnings(); }
public void cancelAfterWarnings() { wrapperContained.cancelAfterWarnings(); }
// public static void cancelAfterWarnings() { net.minecraft.client.resource.VideoWarningManager.cancelAfterWarnings(); }
public boolean shouldWarn() { return wrapperContained.shouldWarn(); }
// public static boolean shouldWarn() { return net.minecraft.client.resource.VideoWarningManager.shouldWarn(); }
public boolean hasCancelledAfterWarning() { return wrapperContained.hasCancelledAfterWarning(); }
// public static boolean hasCancelledAfterWarning() { return net.minecraft.client.resource.VideoWarningManager.hasCancelledAfterWarning(); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.client.resource.VideoWarningManager.reset(); }
// public void method_30919(java.lang.StringBuilder key,java.lang.String value) { wrapperContained.method_30919(key,value); }
// public static void method_30919(java.lang.StringBuilder key,java.lang.String value, ) { net.minecraft.client.resource.VideoWarningManager.method_30919(key,value); }
public java.lang.String getWarningsAsString() { return wrapperContained.getWarningsAsString(); }
// public static java.lang.String getWarningsAsString() { return net.minecraft.client.resource.VideoWarningManager.getWarningsAsString(); }

}
package yarnwrap.client.resource;
public class VideoWarningManager { public net.minecraft.client.resource.VideoWarningManager wrapperContained; public VideoWarningManager(net.minecraft.client.resource.VideoWarningManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier GPU_WARNLIST_ID() { return new yarnwrap.util.Identifier(wrapperContained.GPU_WARNLIST_ID); }
// public void GPU_WARNLIST_ID(yarnwrap.util.Identifier value) { wrapperContained.GPU_WARNLIST_ID = value.wrapperContained; }
// public com.google.common.collect.ImmutableMap warnings() { return wrapperContained.warnings; }
// public void warnings(com.google.common.collect.ImmutableMap value) { wrapperContained.warnings = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public boolean warningScheduled() { return wrapperContained.warningScheduled; }
// public void warningScheduled(boolean value) { wrapperContained.warningScheduled = value; }
// public boolean warned() { return wrapperContained.warned; }
// public void warned(boolean value) { wrapperContained.warned = value; }
// public boolean cancelledAfterWarning() { return wrapperContained.cancelledAfterWarning; }
// public void cancelledAfterWarning(boolean value) { wrapperContained.cancelledAfterWarning = value; }
public boolean hasWarning() { return wrapperContained.hasWarning(); }
// public void compilePatterns(com.google.gson.JsonArray array,java.util.List patterns) { wrapperContained.compilePatterns(array,patterns); }
public java.lang.String getRendererWarning() { return wrapperContained.getRendererWarning(); }
// public com.google.gson.JsonObject loadWarnlist(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.profiler.Profiler profiler) { return wrapperContained.loadWarnlist(resourceManager.wrapperContained,profiler.wrapperContained); }
public java.lang.String getVersionWarning() { return wrapperContained.getVersionWarning(); }
public java.lang.String getVendorWarning() { return wrapperContained.getVendorWarning(); }
public boolean canWarn() { return wrapperContained.canWarn(); }
public void scheduleWarning() { wrapperContained.scheduleWarning(); }
public void acceptAfterWarnings() { wrapperContained.acceptAfterWarnings(); }
public void cancelAfterWarnings() { wrapperContained.cancelAfterWarnings(); }
public boolean shouldWarn() { return wrapperContained.shouldWarn(); }
public boolean hasCancelledAfterWarning() { return wrapperContained.hasCancelledAfterWarning(); }
public void reset() { wrapperContained.reset(); }
public java.lang.String getWarningsAsString() { return wrapperContained.getWarningsAsString(); }

}
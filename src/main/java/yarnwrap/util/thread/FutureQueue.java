package yarnwrap.util.thread;
public class FutureQueue { public net.minecraft.util.thread.FutureQueue wrapperContained; public FutureQueue(net.minecraft.util.thread.FutureQueue wrapperContained) { this.wrapperContained = wrapperContained; }

public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }

}
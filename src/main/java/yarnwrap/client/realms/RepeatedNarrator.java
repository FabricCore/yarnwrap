package yarnwrap.client.realms;
public class RepeatedNarrator { public net.minecraft.client.realms.RepeatedNarrator wrapperContained; public RepeatedNarrator(net.minecraft.client.realms.RepeatedNarrator wrapperContained) { this.wrapperContained = wrapperContained; }

// public float permitsPerSecond() { return wrapperContained.permitsPerSecond; }
// public void permitsPerSecond(float value) { wrapperContained.permitsPerSecond = value; }
// public java.util.concurrent.atomic.AtomicReference params() { return wrapperContained.params; }
// public void params(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.params = value; }
public void narrate(yarnwrap.client.util.NarratorManager narratorManager,yarnwrap.text.Text text) { wrapperContained.narrate(narratorManager.wrapperContained,text.wrapperContained); }

}
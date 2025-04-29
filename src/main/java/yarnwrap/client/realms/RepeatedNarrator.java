package yarnwrap.client.realms;
public class RepeatedNarrator { public net.minecraft.client.realms.RepeatedNarrator wrapperContained; public RepeatedNarrator(net.minecraft.client.realms.RepeatedNarrator wrapperContained) { this.wrapperContained = wrapperContained; }

// public float permitsPerSecond() { return wrapperContained.permitsPerSecond; }
// public void permitsPerSecond(float value) { wrapperContained.permitsPerSecond = value; }
// public static float permitsPerSecond() { return net.minecraft.client.realms.RepeatedNarrator.permitsPerSecond; }
// public static void permitsPerSecond(float value, ) { net.minecraft.client.realms.RepeatedNarrator.permitsPerSecond = value; }

// public java.util.concurrent.atomic.AtomicReference params() { return wrapperContained.params; }
// public void params(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.params = value; }
// public static java.util.concurrent.atomic.AtomicReference params() { return net.minecraft.client.realms.RepeatedNarrator.params; }
// public static void params(java.util.concurrent.atomic.AtomicReference value, ) { net.minecraft.client.realms.RepeatedNarrator.params = value; }

public RepeatedNarrator(java.time.Duration duration) { this.wrapperContained = new net.minecraft.client.realms.RepeatedNarrator(duration); }
public void narrate(yarnwrap.client.util.NarratorManager narratorManager,yarnwrap.text.Text text) { wrapperContained.narrate(narratorManager.wrapperContained,text.wrapperContained); }
// public static void narrate(yarnwrap.client.util.NarratorManager narratorManager,yarnwrap.text.Text text, ) { net.minecraft.client.realms.RepeatedNarrator.narrate(narratorManager.wrapperContained,text.wrapperContained); }
// public Object method_25500(yarnwrap.text.Text parameters) { return wrapperContained.method_25500(parameters.wrapperContained); }
// public static Object method_25500(yarnwrap.text.Text parameters, ) { return net.minecraft.client.realms.RepeatedNarrator.method_25500(parameters.wrapperContained); }

}
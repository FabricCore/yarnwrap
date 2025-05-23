package yarnwrap.client.util.tracy;
public class TracyLoader { public net.minecraft.client.util.tracy.TracyLoader wrapperContained; public TracyLoader(net.minecraft.client.util.tracy.TracyLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean loaded() { return wrapperContained.loaded; }
// public void loaded(boolean value) { wrapperContained.loaded = value; }
// public static boolean loaded() { return net.minecraft.client.util.tracy.TracyLoader.loaded; }
// public static void loaded(boolean value, ) { net.minecraft.client.util.tracy.TracyLoader.loaded = value; }

// public void load() { wrapperContained.load(); }
public static void load() { net.minecraft.client.util.tracy.TracyLoader.load(); }
// public void method_64228(java.lang.String message,org.slf4j.event.Level level) { wrapperContained.method_64228(message,level); }
// public static void method_64228(java.lang.String message,org.slf4j.event.Level level, ) { net.minecraft.client.util.tracy.TracyLoader.method_64228(message,level); }
// public int getColor(org.slf4j.event.Level level) { return wrapperContained.getColor(level); }
// public static int getColor(org.slf4j.event.Level level, ) { return net.minecraft.client.util.tracy.TracyLoader.getColor(level); }

}
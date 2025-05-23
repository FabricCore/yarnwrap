package yarnwrap.client.data;
public class ModelProvider { public net.minecraft.client.data.ModelProvider wrapperContained; public ModelProvider(net.minecraft.client.data.ModelProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object blockstatesPathResolver() { return wrapperContained.blockstatesPathResolver; }
// // public void blockstatesPathResolver(Object value) { wrapperContained.blockstatesPathResolver = value; }
// // public static Object blockstatesPathResolver() { return net.minecraft.client.data.ModelProvider.blockstatesPathResolver; }
// // public static void blockstatesPathResolver(Object value, ) { net.minecraft.client.data.ModelProvider.blockstatesPathResolver = value; }

// public Object modelsPathResolver() { return wrapperContained.modelsPathResolver; }
// // public void modelsPathResolver(Object value) { wrapperContained.modelsPathResolver = value; }
// // public static Object modelsPathResolver() { return net.minecraft.client.data.ModelProvider.modelsPathResolver; }
// // public static void modelsPathResolver(Object value, ) { net.minecraft.client.data.ModelProvider.modelsPathResolver = value; }

// public Object itemsPathResolver() { return wrapperContained.itemsPathResolver; }
// // public void itemsPathResolver(Object value) { wrapperContained.itemsPathResolver = value; }
// // public static Object itemsPathResolver() { return net.minecraft.client.data.ModelProvider.itemsPathResolver; }
// // public static void itemsPathResolver(Object value, ) { net.minecraft.client.data.ModelProvider.itemsPathResolver = value; }

public ModelProvider(yarnwrap.data.DataOutput output) { this.wrapperContained = new net.minecraft.client.data.ModelProvider(output.wrapperContained); }

}
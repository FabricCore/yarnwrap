package yarnwrap.data;
public class MetadataProvider { public net.minecraft.data.MetadataProvider wrapperContained; public MetadataProvider(net.minecraft.data.MetadataProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(net.minecraft.data.MetadataProvider.output); }
// public static void output(yarnwrap.data.DataOutput value, ) { net.minecraft.data.MetadataProvider.output = value.wrapperContained; }

// public java.util.Map metadata() { return wrapperContained.metadata; }
// public void metadata(java.util.Map value) { wrapperContained.metadata = value; }
// public static java.util.Map metadata() { return net.minecraft.data.MetadataProvider.metadata; }
// public static void metadata(java.util.Map value, ) { net.minecraft.data.MetadataProvider.metadata = value; }

public MetadataProvider(yarnwrap.data.DataOutput output) { this.wrapperContained = new net.minecraft.data.MetadataProvider(output.wrapperContained); }
public yarnwrap.data.MetadataProvider add(yarnwrap.resource.metadata.ResourceMetadataSerializer serializer,java.lang.Object metadata) { return new yarnwrap.data.MetadataProvider(wrapperContained.add(serializer.wrapperContained,metadata)); }
// public static yarnwrap.data.MetadataProvider add(yarnwrap.resource.metadata.ResourceMetadataSerializer serializer,java.lang.Object metadata, ) { return new yarnwrap.data.MetadataProvider(net.minecraft.data.MetadataProvider.add(serializer.wrapperContained,metadata)); }
// public void method_46186(com.google.gson.JsonObject key,java.lang.String jsonSupplier) { wrapperContained.method_46186(key,jsonSupplier); }
// public static void method_46186(com.google.gson.JsonObject key,java.lang.String jsonSupplier, ) { net.minecraft.data.MetadataProvider.method_46186(key,jsonSupplier); }
// public yarnwrap.data.MetadataProvider create(yarnwrap.data.DataOutput output,yarnwrap.text.Text description,yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures) { return new yarnwrap.data.MetadataProvider(wrapperContained.create(output.wrapperContained,description.wrapperContained,requiredFeatures.wrapperContained)); }
// public static yarnwrap.data.MetadataProvider create(yarnwrap.data.DataOutput output,yarnwrap.text.Text description,yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures, ) { return new yarnwrap.data.MetadataProvider(net.minecraft.data.MetadataProvider.create(output.wrapperContained,description.wrapperContained,requiredFeatures.wrapperContained)); }
// public yarnwrap.data.MetadataProvider create(yarnwrap.data.DataOutput output,yarnwrap.text.Text description) { return new yarnwrap.data.MetadataProvider(wrapperContained.create(output.wrapperContained,description.wrapperContained)); }
// public static yarnwrap.data.MetadataProvider create(yarnwrap.data.DataOutput output,yarnwrap.text.Text description, ) { return new yarnwrap.data.MetadataProvider(net.minecraft.data.MetadataProvider.create(output.wrapperContained,description.wrapperContained)); }

}
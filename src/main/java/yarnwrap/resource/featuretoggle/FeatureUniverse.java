package yarnwrap.resource.featuretoggle;
public class FeatureUniverse { public net.minecraft.resource.featuretoggle.FeatureUniverse wrapperContained; public FeatureUniverse(net.minecraft.resource.featuretoggle.FeatureUniverse wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public FeatureUniverse(java.lang.String name) { this.wrapperContained = new net.minecraft.resource.featuretoggle.FeatureUniverse(name); }

}
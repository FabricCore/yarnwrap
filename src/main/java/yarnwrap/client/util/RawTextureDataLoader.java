package yarnwrap.client.util;
public class RawTextureDataLoader { public net.minecraft.client.util.RawTextureDataLoader wrapperContained; public RawTextureDataLoader(net.minecraft.client.util.RawTextureDataLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] loadRawTextureData(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier id) { return wrapperContained.loadRawTextureData(resourceManager.wrapperContained,id.wrapperContained); }

}
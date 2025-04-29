package yarnwrap.client.texture;
public class DynamicTexture { public net.minecraft.client.texture.DynamicTexture wrapperContained; public DynamicTexture(net.minecraft.client.texture.DynamicTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public void save(yarnwrap.util.Identifier id,java.nio.file.Path path) { wrapperContained.save(id.wrapperContained,path); }
// public static void save(yarnwrap.util.Identifier id,java.nio.file.Path path, ) { net.minecraft.client.texture.DynamicTexture.save(id.wrapperContained,path); }

}
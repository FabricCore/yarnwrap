package yarnwrap.network.packet.s2c.play;
public class SynchronizeRecipesS2CPacket { public net.minecraft.network.packet.s2c.play.SynchronizeRecipesS2CPacket wrapperContained; public SynchronizeRecipesS2CPacket(net.minecraft.network.packet.s2c.play.SynchronizeRecipesS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List recipes() { return wrapperContained.recipes; }
// public void recipes(java.util.List value) { wrapperContained.recipes = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public java.util.List getRecipes() { return wrapperContained.getRecipes(); }

}
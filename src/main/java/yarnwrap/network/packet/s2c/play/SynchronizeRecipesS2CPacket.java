package yarnwrap.network.packet.s2c.play;
public class SynchronizeRecipesS2CPacket { public net.minecraft.network.packet.s2c.play.SynchronizeRecipesS2CPacket wrapperContained; public SynchronizeRecipesS2CPacket(net.minecraft.network.packet.s2c.play.SynchronizeRecipesS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List recipes() { return wrapperContained.recipes; }
// public void recipes(java.util.List value) { wrapperContained.recipes = value; }
// public static java.util.List recipes() { return net.minecraft.network.packet.s2c.play.SynchronizeRecipesS2CPacket.recipes; }
// public static void recipes(java.util.List value, ) { net.minecraft.network.packet.s2c.play.SynchronizeRecipesS2CPacket.recipes = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.SynchronizeRecipesS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.SynchronizeRecipesS2CPacket.CODEC = value.wrapperContained; }

public SynchronizeRecipesS2CPacket(java.util.Collection recipes) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.SynchronizeRecipesS2CPacket(recipes); }
public java.util.List getRecipes() { return wrapperContained.getRecipes(); }
// public static java.util.List getRecipes() { return net.minecraft.network.packet.s2c.play.SynchronizeRecipesS2CPacket.getRecipes(); }
// public java.util.List method_55955(yarnwrap.network.packet.s2c.play.SynchronizeRecipesS2CPacket packet) { return wrapperContained.method_55955(packet.wrapperContained); }
// public static java.util.List method_55955(yarnwrap.network.packet.s2c.play.SynchronizeRecipesS2CPacket packet, ) { return net.minecraft.network.packet.s2c.play.SynchronizeRecipesS2CPacket.method_55955(packet.wrapperContained); }

}
package yarnwrap.util;
public class PlayerInput { public net.minecraft.util.PlayerInput wrapperContained; public PlayerInput(net.minecraft.util.PlayerInput wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean sneak() { return wrapperContained.sneak; }
// public void sneak(boolean value) { wrapperContained.sneak = value; }
// public static boolean sneak() { return net.minecraft.util.PlayerInput.sneak; }
// public static void sneak(boolean value, ) { net.minecraft.util.PlayerInput.sneak = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.util.PlayerInput.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.util.PlayerInput.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.util.PlayerInput DEFAULT() { return new yarnwrap.util.PlayerInput(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.util.PlayerInput value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.util.PlayerInput DEFAULT() { return new yarnwrap.util.PlayerInput(net.minecraft.util.PlayerInput.DEFAULT); }
// public static void DEFAULT(yarnwrap.util.PlayerInput value, ) { net.minecraft.util.PlayerInput.DEFAULT = value.wrapperContained; }

// public byte FORWARD() { return wrapperContained.FORWARD; }
// public void FORWARD(byte value) { wrapperContained.FORWARD = value; }
// public static byte FORWARD() { return net.minecraft.util.PlayerInput.FORWARD; }
// public static void FORWARD(byte value, ) { net.minecraft.util.PlayerInput.FORWARD = value; }

// public byte BACKWARD() { return wrapperContained.BACKWARD; }
// public void BACKWARD(byte value) { wrapperContained.BACKWARD = value; }
// public static byte BACKWARD() { return net.minecraft.util.PlayerInput.BACKWARD; }
// public static void BACKWARD(byte value, ) { net.minecraft.util.PlayerInput.BACKWARD = value; }

// public byte LEFT() { return wrapperContained.LEFT; }
// public void LEFT(byte value) { wrapperContained.LEFT = value; }
// public static byte LEFT() { return net.minecraft.util.PlayerInput.LEFT; }
// public static void LEFT(byte value, ) { net.minecraft.util.PlayerInput.LEFT = value; }

// public byte RIGHT() { return wrapperContained.RIGHT; }
// public void RIGHT(byte value) { wrapperContained.RIGHT = value; }
// public static byte RIGHT() { return net.minecraft.util.PlayerInput.RIGHT; }
// public static void RIGHT(byte value, ) { net.minecraft.util.PlayerInput.RIGHT = value; }

// public byte JUMP() { return wrapperContained.JUMP; }
// public void JUMP(byte value) { wrapperContained.JUMP = value; }
// public static byte JUMP() { return net.minecraft.util.PlayerInput.JUMP; }
// public static void JUMP(byte value, ) { net.minecraft.util.PlayerInput.JUMP = value; }

// public byte SNEAK() { return wrapperContained.SNEAK; }
// public void SNEAK(byte value) { wrapperContained.SNEAK = value; }
// public static byte SNEAK() { return net.minecraft.util.PlayerInput.SNEAK; }
// public static void SNEAK(byte value, ) { net.minecraft.util.PlayerInput.SNEAK = value; }

// public byte SPRINT() { return wrapperContained.SPRINT; }
// public void SPRINT(byte value) { wrapperContained.SPRINT = value; }
// public static byte SPRINT() { return net.minecraft.util.PlayerInput.SPRINT; }
// public static void SPRINT(byte value, ) { net.minecraft.util.PlayerInput.SPRINT = value; }

// public boolean sneak() { return wrapperContained.sneak(); }
// // public static boolean sneak() { return net.minecraft.util.PlayerInput.sneak(); }

}
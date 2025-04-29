package yarnwrap.network.packet.c2s.play;
public class PlayerMoveC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket wrapperContained; public PlayerMoveC2SPacket(net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public static double z() { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.z; }
// public static void z(double value, ) { net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.z = value; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.pitch; }
// public static void pitch(float value, ) { net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.pitch = value; }

// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public static double y() { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.y; }
// public static void y(double value, ) { net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.y = value; }

// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.yaw; }
// public static void yaw(float value, ) { net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.yaw = value; }

// public boolean changeLook() { return wrapperContained.changeLook; }
// public void changeLook(boolean value) { wrapperContained.changeLook = value; }
// public static boolean changeLook() { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.changeLook; }
// public static void changeLook(boolean value, ) { net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.changeLook = value; }

// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public static double x() { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.x; }
// public static void x(double value, ) { net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.x = value; }

// public boolean changePosition() { return wrapperContained.changePosition; }
// public void changePosition(boolean value) { wrapperContained.changePosition = value; }
// public static boolean changePosition() { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.changePosition; }
// public static void changePosition(boolean value, ) { net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.changePosition = value; }

// public boolean onGround() { return wrapperContained.onGround; }
// public void onGround(boolean value) { wrapperContained.onGround = value; }
// public static boolean onGround() { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.onGround; }
// public static void onGround(boolean value, ) { net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.onGround = value; }

// public PlayerMoveC2SPacket(double x,double y,double z,float yaw,float pitch,boolean onGround,boolean changePosition,boolean changeLook) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket(x,y,z,yaw,pitch,onGround,changePosition,changeLook); }
public double getY(double currentY) { return wrapperContained.getY(currentY); }
// public static double getY(double currentY, ) { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.getY(currentY); }
public double getX(double currentX) { return wrapperContained.getX(currentX); }
// public static double getX(double currentX, ) { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.getX(currentX); }
public float getPitch(float currentPitch) { return wrapperContained.getPitch(currentPitch); }
// public static float getPitch(float currentPitch, ) { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.getPitch(currentPitch); }
public float getYaw(float currentYaw) { return wrapperContained.getYaw(currentYaw); }
// public static float getYaw(float currentYaw, ) { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.getYaw(currentYaw); }
// public void apply() { wrapperContained.apply(); }
// public static void apply() { net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.apply(); }
public boolean isOnGround() { return wrapperContained.isOnGround(); }
// public static boolean isOnGround() { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.isOnGround(); }
public double getZ(double currentZ) { return wrapperContained.getZ(currentZ); }
// public static double getZ(double currentZ, ) { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.getZ(currentZ); }
public boolean changesPosition() { return wrapperContained.changesPosition(); }
// public static boolean changesPosition() { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.changesPosition(); }
public boolean changesLook() { return wrapperContained.changesLook(); }
// public static boolean changesLook() { return net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.changesLook(); }

}
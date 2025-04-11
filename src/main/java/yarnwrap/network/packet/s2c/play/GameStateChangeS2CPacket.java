package yarnwrap.network.packet.s2c.play;
public class GameStateChangeS2CPacket { public net.minecraft.network.packet.s2c.play.GameStateChangeS2CPacket wrapperContained; public GameStateChangeS2CPacket(net.minecraft.network.packet.s2c.play.GameStateChangeS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float value() { return wrapperContained.value; }
// public void value(float value) { wrapperContained.value = value; }
// public Object reason() { return wrapperContained.reason; }
// // public void reason(Object value) { wrapperContained.reason = value; }
public Object NO_RESPAWN_BLOCK() { return wrapperContained.NO_RESPAWN_BLOCK; }
// // public void NO_RESPAWN_BLOCK(Object value) { wrapperContained.NO_RESPAWN_BLOCK = value; }
public Object RAIN_STARTED() { return wrapperContained.RAIN_STARTED; }
// // public void RAIN_STARTED(Object value) { wrapperContained.RAIN_STARTED = value; }
public Object RAIN_STOPPED() { return wrapperContained.RAIN_STOPPED; }
// // public void RAIN_STOPPED(Object value) { wrapperContained.RAIN_STOPPED = value; }
public Object GAME_MODE_CHANGED() { return wrapperContained.GAME_MODE_CHANGED; }
// // public void GAME_MODE_CHANGED(Object value) { wrapperContained.GAME_MODE_CHANGED = value; }
public Object GAME_WON() { return wrapperContained.GAME_WON; }
// // public void GAME_WON(Object value) { wrapperContained.GAME_WON = value; }
public Object DEMO_MESSAGE_SHOWN() { return wrapperContained.DEMO_MESSAGE_SHOWN; }
// // public void DEMO_MESSAGE_SHOWN(Object value) { wrapperContained.DEMO_MESSAGE_SHOWN = value; }
public Object PROJECTILE_HIT_PLAYER() { return wrapperContained.PROJECTILE_HIT_PLAYER; }
// // public void PROJECTILE_HIT_PLAYER(Object value) { wrapperContained.PROJECTILE_HIT_PLAYER = value; }
public Object RAIN_GRADIENT_CHANGED() { return wrapperContained.RAIN_GRADIENT_CHANGED; }
// // public void RAIN_GRADIENT_CHANGED(Object value) { wrapperContained.RAIN_GRADIENT_CHANGED = value; }
public Object THUNDER_GRADIENT_CHANGED() { return wrapperContained.THUNDER_GRADIENT_CHANGED; }
// // public void THUNDER_GRADIENT_CHANGED(Object value) { wrapperContained.THUNDER_GRADIENT_CHANGED = value; }
public Object PUFFERFISH_STING() { return wrapperContained.PUFFERFISH_STING; }
// // public void PUFFERFISH_STING(Object value) { wrapperContained.PUFFERFISH_STING = value; }
public Object ELDER_GUARDIAN_EFFECT() { return wrapperContained.ELDER_GUARDIAN_EFFECT; }
// // public void ELDER_GUARDIAN_EFFECT(Object value) { wrapperContained.ELDER_GUARDIAN_EFFECT = value; }
public Object IMMEDIATE_RESPAWN() { return wrapperContained.IMMEDIATE_RESPAWN; }
// // public void IMMEDIATE_RESPAWN(Object value) { wrapperContained.IMMEDIATE_RESPAWN = value; }
public int DEMO_OPEN_SCREEN() { return wrapperContained.DEMO_OPEN_SCREEN; }
// public void DEMO_OPEN_SCREEN(int value) { wrapperContained.DEMO_OPEN_SCREEN = value; }
public int DEMO_MOVEMENT_HELP() { return wrapperContained.DEMO_MOVEMENT_HELP; }
// public void DEMO_MOVEMENT_HELP(int value) { wrapperContained.DEMO_MOVEMENT_HELP = value; }
public int DEMO_JUMP_HELP() { return wrapperContained.DEMO_JUMP_HELP; }
// public void DEMO_JUMP_HELP(int value) { wrapperContained.DEMO_JUMP_HELP = value; }
public int DEMO_INVENTORY_HELP() { return wrapperContained.DEMO_INVENTORY_HELP; }
// public void DEMO_INVENTORY_HELP(int value) { wrapperContained.DEMO_INVENTORY_HELP = value; }
public int DEMO_EXPIRY_NOTICE() { return wrapperContained.DEMO_EXPIRY_NOTICE; }
// public void DEMO_EXPIRY_NOTICE(int value) { wrapperContained.DEMO_EXPIRY_NOTICE = value; }
public Object LIMITED_CRAFTING_TOGGLED() { return wrapperContained.LIMITED_CRAFTING_TOGGLED; }
// // public void LIMITED_CRAFTING_TOGGLED(Object value) { wrapperContained.LIMITED_CRAFTING_TOGGLED = value; }
public Object INITIAL_CHUNKS_COMING() { return wrapperContained.INITIAL_CHUNKS_COMING; }
// // public void INITIAL_CHUNKS_COMING(Object value) { wrapperContained.INITIAL_CHUNKS_COMING = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public GameStateChangeS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.GameStateChangeS2CPacket(buf.wrapperContained); }
// public GameStateChangeS2CPacket(Object reason,float value) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.GameStateChangeS2CPacket(reason,value); }
public Object getReason() { return wrapperContained.getReason(); }
public float getValue() { return wrapperContained.getValue(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}
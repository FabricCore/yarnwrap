package yarnwrap.predicate;
public class StatePredicate { public net.minecraft.predicate.StatePredicate wrapperContained; public StatePredicate(net.minecraft.predicate.StatePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List conditions() { return wrapperContained.conditions; }
// public void conditions(java.util.List value) { wrapperContained.conditions = value; }
// public static java.util.List conditions() { return net.minecraft.predicate.StatePredicate.conditions; }
// public static void conditions(java.util.List value, ) { net.minecraft.predicate.StatePredicate.conditions = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.StatePredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.StatePredicate.CODEC = value; }

// public com.mojang.serialization.Codec CONDITION_LIST_CODEC() { return wrapperContained.CONDITION_LIST_CODEC; }
// public void CONDITION_LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.CONDITION_LIST_CODEC = value; }
// public static com.mojang.serialization.Codec CONDITION_LIST_CODEC() { return net.minecraft.predicate.StatePredicate.CONDITION_LIST_CODEC; }
// public static void CONDITION_LIST_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.StatePredicate.CONDITION_LIST_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.predicate.StatePredicate.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.predicate.StatePredicate.PACKET_CODEC = value.wrapperContained; }

public StatePredicate(java.util.List conditions) { this.wrapperContained = new net.minecraft.predicate.StatePredicate(conditions); }
// public java.util.List conditions() { return wrapperContained.conditions(); }
// // public static java.util.List conditions() { return net.minecraft.predicate.StatePredicate.conditions(); }
public boolean test(yarnwrap.block.BlockState state) { return wrapperContained.test(state.wrapperContained); }
// public static boolean test(yarnwrap.block.BlockState state, ) { return net.minecraft.predicate.StatePredicate.test(state.wrapperContained); }
public boolean test(yarnwrap.state.StateManager stateManager,yarnwrap.state.State container) { return wrapperContained.test(stateManager.wrapperContained,container.wrapperContained); }
// public static boolean test(yarnwrap.state.StateManager stateManager,yarnwrap.state.State container, ) { return net.minecraft.predicate.StatePredicate.test(stateManager.wrapperContained,container.wrapperContained); }
public boolean test(yarnwrap.fluid.FluidState state) { return wrapperContained.test(state.wrapperContained); }
// public static boolean test(yarnwrap.fluid.FluidState state, ) { return net.minecraft.predicate.StatePredicate.test(state.wrapperContained); }
public java.util.Optional findMissing(yarnwrap.state.StateManager stateManager) { return wrapperContained.findMissing(stateManager.wrapperContained); }
// public static java.util.Optional findMissing(yarnwrap.state.StateManager stateManager, ) { return net.minecraft.predicate.StatePredicate.findMissing(stateManager.wrapperContained); }
// public java.util.Map method_53236(java.util.List conditions) { return wrapperContained.method_53236(conditions); }
// public static java.util.Map method_53236(java.util.List conditions, ) { return net.minecraft.predicate.StatePredicate.method_53236(conditions); }
// public Object method_53237(Object state) { return wrapperContained.method_53237(state); }
// public static Object method_53237(Object state, ) { return net.minecraft.predicate.StatePredicate.method_53237(state); }
// public java.util.List method_53238(java.util.Map states) { return wrapperContained.method_53238(states); }
// public static java.util.List method_53238(java.util.Map states, ) { return net.minecraft.predicate.StatePredicate.method_53238(states); }

}
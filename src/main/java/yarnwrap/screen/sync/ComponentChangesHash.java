package yarnwrap.screen.sync;
public class ComponentChangesHash { public net.minecraft.screen.sync.ComponentChangesHash wrapperContained; public ComponentChangesHash(net.minecraft.screen.sync.ComponentChangesHash wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.screen.sync.ComponentChangesHash.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.screen.sync.ComponentChangesHash.PACKET_CODEC = value.wrapperContained; }

// public void method_68847(java.util.Map component) { wrapperContained.method_68847(component); }
// public static void method_68847(java.util.Map component, ) { net.minecraft.screen.sync.ComponentChangesHash.method_68847(component); }
// public yarnwrap.screen.sync.ComponentChangesHash fromComponents(yarnwrap.component.ComponentChanges changes,Object hasher) { return new yarnwrap.screen.sync.ComponentChangesHash(wrapperContained.fromComponents(changes.wrapperContained,hasher)); }
// public static yarnwrap.screen.sync.ComponentChangesHash fromComponents(yarnwrap.component.ComponentChanges changes,Object hasher, ) { return new yarnwrap.screen.sync.ComponentChangesHash(net.minecraft.screen.sync.ComponentChangesHash.fromComponents(changes.wrapperContained,hasher)); }
// public boolean hashEquals(yarnwrap.component.ComponentChanges changes,Object hasher) { return wrapperContained.hashEquals(changes.wrapperContained,hasher); }
// public static boolean hashEquals(yarnwrap.component.ComponentChanges changes,Object hasher, ) { return net.minecraft.screen.sync.ComponentChangesHash.hashEquals(changes.wrapperContained,hasher); }

}
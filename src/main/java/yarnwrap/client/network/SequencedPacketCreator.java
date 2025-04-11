package yarnwrap.client.network;
public class SequencedPacketCreator { public net.minecraft.client.network.SequencedPacketCreator wrapperContained; public SequencedPacketCreator(net.minecraft.client.network.SequencedPacketCreator wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.packet.Packet predict(int sequence) { return new yarnwrap.network.packet.Packet(wrapperContained.predict(sequence)); }

}
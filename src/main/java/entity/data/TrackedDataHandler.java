package yarnwrap.entity.data;
public class TrackedDataHandler { public net.minecraft.entity.data.TrackedDataHandler wrapperContained; public TrackedDataHandler(net.minecraft.entity.data.TrackedDataHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Object copy(java.lang.Object value) { return wrapperContained.copy(value); }
public yarnwrap.entity.data.TrackedData create(int id) { return new yarnwrap.entity.data.TrackedData(wrapperContained.create(id)); }
// public yarnwrap.entity.data.TrackedDataHandler create(yarnwrap.network.codec.PacketCodec codec) { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.create(codec.wrapperContained)); }

}
package yarnwrap.block.jukebox;
public class JukeboxSongs { public net.minecraft.block.jukebox.JukeboxSongs wrapperContained; public JukeboxSongs(net.minecraft.block.jukebox.JukeboxSongs wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey THIRTEEN() { return new yarnwrap.registry.RegistryKey(wrapperContained.THIRTEEN); }
public yarnwrap.registry.RegistryKey ELEVEN() { return new yarnwrap.registry.RegistryKey(wrapperContained.ELEVEN); }
public yarnwrap.registry.RegistryKey FIVE() { return new yarnwrap.registry.RegistryKey(wrapperContained.FIVE); }
// // public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,Object soundEvent,int lengthInSeconds,int comparatorOutput) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,soundEvent,lengthInSeconds,comparatorOutput); }

}
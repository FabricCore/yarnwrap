package yarnwrap;

import org.mozilla.javascript.Undefined;

import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.*;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.*;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.*;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents.*;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.*;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.*;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientWorldEvents.*;
import net.fabricmc.fabric.api.client.message.v1.*;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.*;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.*;
import net.fabricmc.fabric.api.client.networking.v1.*;
import net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents.*;
import net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents.*;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.*;
import net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents.*;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.*;
import net.fabricmc.fabric.api.client.particle.v1.*;
import net.fabricmc.fabric.api.client.particle.v1.ParticleRenderEvents.*;
import net.fabricmc.fabric.api.client.rendering.v1.*;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRenderEvents.*;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext.BlockOutlineContext;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents.*;
import net.fabricmc.fabric.api.client.screen.v1.*;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.*;
import net.fabricmc.fabric.api.entity.event.v1.*;
import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents.*;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.*;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents.*;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents.*;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents.*;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents.*;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.client.player.*;
import net.fabricmc.fabric.api.event.client.player.ClientPlayerBlockBreakEvents.*;
import net.fabricmc.fabric.api.event.lifecycle.v1.*;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents.*;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents.*;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.*;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.*;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.*;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.*;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents.*;
import net.fabricmc.fabric.api.event.player.*;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents.*;
import net.fabricmc.fabric.api.event.player.PlayerPickItemEvents.*;
import net.fabricmc.fabric.api.item.v1.*;
import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents.*;
import net.fabricmc.fabric.api.item.v1.EnchantmentEvents.*;
import net.fabricmc.fabric.api.itemgroup.v1.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.*;
import net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup;
import net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup;
import net.fabricmc.fabric.api.loot.v2.*;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents.*;
import net.fabricmc.fabric.api.loot.v3.*;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents.*;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.fabricmc.fabric.api.message.v1.*;
import net.fabricmc.fabric.api.message.v1.ServerMessageDecoratorEvent.*;
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents.*;
import net.fabricmc.fabric.api.networking.v1.*;
import net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents.*;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents.*;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents.*;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents.*;
import net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents.*;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents.*;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.fluid.*;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage.*;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.EmptyItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.FullItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SidedStorageBlockEntity;
import net.fabricmc.fabric.api.util.TriState;
import net.fabricmc.fabric.impl.client.screen.ScreenExtensions;
import net.fabricmc.fabric.impl.itemgroup.ItemGroupEventsImpl;
import net.fabricmc.fabric.impl.transfer.fluid.CombinedProvidersImpl;
import net.fabricmc.fabric.impl.transfer.fluid.EmptyBucketStorage;
import net.fabricmc.fabric.impl.transfer.fluid.WaterPotionStorage;
import net.fabricmc.fabric.mixin.transfer.BucketItemAccessor;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.ClientConfigurationNetworkHandler;
import net.minecraft.client.network.ClientLoginNetworkHandler;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.conversion.EntityConversionContext;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.network.message.MessageDecorator;
import net.minecraft.network.message.MessageType;
import net.minecraft.network.message.SignedMessage;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.potion.Potions;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.resource.LifecycledResourceManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.PlayerManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerConfigurationNetworkHandler;
import net.minecraft.server.network.ServerLoginNetworkHandler;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ChunkHolder;
import net.minecraft.server.world.ChunkLevelType;
import net.minecraft.server.world.ServerChunkManager;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.PersistentState;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.WorldChunk;
import org.jetbrains.annotations.Nullable;

public class Runnable extends ws.siri.jscore.wraps.IRunnable implements
net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.Load,
net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.Unload,
net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Load,
net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Unload,
net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents.Load,
net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents.Unload,
net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStarted,
net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStopping,
net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndTick,
net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndWorldTick,
net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.StartTick,
net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.StartWorldTick,
net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientWorldEvents.AfterClientWorldChange,
net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.AllowChat,
net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.AllowGame,
net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.Chat,
net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.ChatCanceled,
net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.Game,
net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.GameCanceled,
net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.ModifyGame,
net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.AllowChat,
net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.AllowCommand,
net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.Chat,
net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.ChatCanceled,
net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.Command,
net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.CommandCanceled,
net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.ModifyChat,
net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.ModifyCommand,
net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents.Register,
net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents.Unregister,
net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents.Register,
net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents.Unregister,
net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Complete,
net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Disconnect,
net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Init,
net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Ready,
net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Start,
net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents.Disconnect,
net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents.Init,
net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents.QueryStart,
net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Disconnect,
net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Init,
net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Join,
net.fabricmc.fabric.api.client.particle.v1.ParticleRenderEvents.AllowBlockDustTint,
net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRenderEvents.AllowCapeRender,
net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents.AfterEntities,
net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents.AfterSetup,
net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents.AfterTranslucent,
net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents.BeforeBlockOutline,
net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents.BeforeEntities,
net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents.BlockOutline,
net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents.DebugRender,
net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents.End,
net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents.Last,
net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents.Start,
net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.AfterInit,
net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.AfterRender,
net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.AfterTick,
net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.BeforeInit,
net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.BeforeRender,
net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.BeforeTick,
net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.Remove,
net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents.Allow,
net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents.Custom,
net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.AllowBed,
net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.AllowNearbyMonsters,
net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.AllowResettingTime,
net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.AllowSettingSpawn,
net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.AllowSleepTime,
net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.AllowSleeping,
net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.ModifySleepingDirection,
net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.ModifyWakeUpPosition,
net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.SetBedOccupationState,
net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.StartSleeping,
net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.StopSleeping,
net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents.AfterKilledOtherEntity,
net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents.AfterEntityChange,
net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents.AfterPlayerChange,
net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents.AfterDamage,
net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents.AfterDeath,
net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents.AllowDamage,
net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents.AllowDeath,
net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents.MobConversion,
net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents.AfterRespawn,
net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents.AllowDeath,
net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents.CopyFrom,
net.fabricmc.fabric.api.event.client.player.ClientPlayerBlockBreakEvents.After,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents.Load,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents.Unload,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.Generate,
// net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.LevelTypeChange,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.Load,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.Unload,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.EquipmentChange,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.Load,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.Unload,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.AfterSave,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.BeforeSave,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.EndDataPackReload,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStarted,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStarting,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStopped,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStopping,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.StartDataPackReload,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.SyncDataPackContents,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.EndTick,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.EndWorldTick,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.StartTick,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.StartWorldTick,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents.Load,
net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents.Unload,
net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents.After,
net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents.Before,
net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents.Canceled,
net.fabricmc.fabric.api.event.player.PlayerPickItemEvents.PickItemFromBlock,
net.fabricmc.fabric.api.event.player.PlayerPickItemEvents.PickItemFromEntity,
net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents.ModifyCallback,
net.fabricmc.fabric.api.item.v1.EnchantmentEvents.AllowEnchanting,
net.fabricmc.fabric.api.item.v1.EnchantmentEvents.Modify,
net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries,
net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntriesAll,
net.fabricmc.fabric.api.loot.v3.LootTableEvents.Loaded,
net.fabricmc.fabric.api.loot.v3.LootTableEvents.Modify,
net.fabricmc.fabric.api.loot.v3.LootTableEvents.Replace,
net.fabricmc.fabric.api.message.v1.ServerMessageEvents.AllowChatMessage,
net.fabricmc.fabric.api.message.v1.ServerMessageEvents.AllowCommandMessage,
net.fabricmc.fabric.api.message.v1.ServerMessageEvents.AllowGameMessage,
net.fabricmc.fabric.api.message.v1.ServerMessageEvents.ChatMessage,
net.fabricmc.fabric.api.message.v1.ServerMessageEvents.CommandMessage,
net.fabricmc.fabric.api.message.v1.ServerMessageEvents.GameMessage,
net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents.StartTracking,
net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents.StopTracking,
net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents.Register,
net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents.Unregister,
net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents.Register,
net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents.Unregister,
net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents.Configure,
net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents.Disconnect,
net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents.Disconnect,
net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents.Init,
net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents.QueryStart,
net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents.Disconnect,
net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents.Init,
net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents.Join,
net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage.CombinedItemApiProvider {

public Runnable(String ident, String function) {
    super(ident, function);
}

@Override
public void onLoad(BlockEntity blockEntity, ClientWorld world) { runF(new yarnwrap.block.entity.BlockEntity(blockEntity), new yarnwrap.client.world.ClientWorld(world)); }

@Override
public void onUnload(BlockEntity blockEntity, ClientWorld world) { runF(new yarnwrap.block.entity.BlockEntity(blockEntity), new yarnwrap.client.world.ClientWorld(world)); }

@Override
public void onChunkLoad(ClientWorld world, WorldChunk chunk) { runF(new yarnwrap.client.world.ClientWorld(world), new yarnwrap.world.chunk.WorldChunk(chunk)); }

@Override
public void onChunkUnload(ClientWorld world, WorldChunk chunk) { runF(new yarnwrap.client.world.ClientWorld(world), new yarnwrap.world.chunk.WorldChunk(chunk)); }

@Override
public void onLoad(Entity entity, ClientWorld world) { runF(new yarnwrap.entity.Entity(entity), new yarnwrap.client.world.ClientWorld(world)); }

@Override
public void onUnload(Entity entity, ClientWorld world) { runF(new yarnwrap.entity.Entity(entity), new yarnwrap.client.world.ClientWorld(world)); }

@Override
public void onClientStarted(MinecraftClient client) { runF(new yarnwrap.client.MinecraftClient(client)); }

@Override
public void onClientStopping(MinecraftClient client) { runF(new yarnwrap.client.MinecraftClient(client)); }

@Override
public void onEndTick(MinecraftClient client) { runF(new yarnwrap.client.MinecraftClient(client)); }

@Override
public void onEndTick(ClientWorld world) { runF(new yarnwrap.client.world.ClientWorld(world)); }

@Override
public void onStartTick(MinecraftClient client) { runF(new yarnwrap.client.MinecraftClient(client)); }

@Override
public void onStartTick(ClientWorld world) { runF(new yarnwrap.client.world.ClientWorld(world)); }

@Override
public void afterWorldChange(MinecraftClient client, ClientWorld world) { runF(new yarnwrap.client.MinecraftClient(client), new yarnwrap.client.world.ClientWorld(world)); }

@Override
public boolean allowReceiveChatMessage(Text message, SignedMessage signedMessage, GameProfile sender, MessageType.Parameters params, Instant receptionTimestamp) { Object res = runF(new yarnwrap.text.Text(message), new yarnwrap.network.message.SignedMessage(signedMessage), sender, params, receptionTimestamp); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowReceiveChatMessage)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public boolean allowReceiveGameMessage(Text message, boolean overlay) { Object res = runF(new yarnwrap.text.Text(message), overlay); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowReceiveGameMessage)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public void onReceiveChatMessage(Text message, SignedMessage signedMessage, GameProfile sender, MessageType.Parameters params, Instant receptionTimestamp) { runF(new yarnwrap.text.Text(message), new yarnwrap.network.message.SignedMessage(signedMessage), sender, params, receptionTimestamp); }

@Override
public void onReceiveChatMessageCanceled(Text message, SignedMessage signedMessage, GameProfile sender, MessageType.Parameters params, Instant receptionTimestamp) { runF(new yarnwrap.text.Text(message), new yarnwrap.network.message.SignedMessage(signedMessage), sender, params, receptionTimestamp); }

@Override
public void onReceiveGameMessage(Text message, boolean overlay) { runF(new yarnwrap.text.Text(message), overlay); }

@Override
public void onReceiveGameMessageCanceled(Text message, boolean overlay) { runF(new yarnwrap.text.Text(message), overlay); }

@Override
public Text modifyReceivedGameMessage(Text message, boolean overlay) { Object res = runF(new yarnwrap.text.Text(message), overlay); if (Undefined.isUndefined(res)) { return message; } else try { return (Text) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (Text) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (modifyReceivedGameMessage)\u00A77] \u00A7c" + e.toString()); return message; } }

@Override
public boolean allowSendChatMessage(String message) { Object res = runF(message); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowSendChatMessage)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public boolean allowSendCommandMessage(String command) { Object res = runF(command); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowSendCommandMessage)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public void onSendChatMessage(String message) { runF(message); }

@Override
public void onSendChatMessageCanceled(String message) { runF(message); }

@Override
public void onSendCommandMessage(String command) { runF(command); }

@Override
public void onSendCommandMessageCanceled(String command) { runF(command); }

@Override
public String modifySendChatMessage(String message) { Object res = runF(message); if (Undefined.isUndefined(res)) { return message; } else try { return (String) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (String) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (modifySendChatMessage)\u00A77] \u00A7c" + e.toString()); return message; } }

@Override
public String modifySendCommandMessage(String command) { Object res = runF(command); if (Undefined.isUndefined(res)) { return command; } else try { return (String) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (String) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (modifySendCommandMessage)\u00A77] \u00A7c" + e.toString()); return command; } }

@Override
public void onChannelRegister(ClientConfigurationNetworkHandler handler, PacketSender sender, MinecraftClient client, List<Identifier> channels) { runF(new yarnwrap.client.network.ClientConfigurationNetworkHandler(handler), sender, new yarnwrap.client.MinecraftClient(client), channels); }

@Override
public void onChannelUnregister(ClientConfigurationNetworkHandler handler, PacketSender sender, MinecraftClient client, List<Identifier> channels) { runF(new yarnwrap.client.network.ClientConfigurationNetworkHandler(handler), sender, new yarnwrap.client.MinecraftClient(client), channels); }

@Override
public void onChannelRegister(ClientPlayNetworkHandler handler, PacketSender sender, MinecraftClient client, List<Identifier> channels) { runF(new yarnwrap.client.network.ClientPlayNetworkHandler(handler), sender, new yarnwrap.client.MinecraftClient(client), channels); }

@Override
public void onChannelUnregister(ClientPlayNetworkHandler handler, PacketSender sender, MinecraftClient client, List<Identifier> channels) { runF(new yarnwrap.client.network.ClientPlayNetworkHandler(handler), sender, new yarnwrap.client.MinecraftClient(client), channels); }

@Override
public void onConfigurationComplete(ClientConfigurationNetworkHandler handler, MinecraftClient client) { runF(new yarnwrap.client.network.ClientConfigurationNetworkHandler(handler), new yarnwrap.client.MinecraftClient(client)); }

@Override
public void onConfigurationDisconnect(ClientConfigurationNetworkHandler handler, MinecraftClient client) { runF(new yarnwrap.client.network.ClientConfigurationNetworkHandler(handler), new yarnwrap.client.MinecraftClient(client)); }

@Override
public void onConfigurationInit(ClientConfigurationNetworkHandler handler, MinecraftClient client) { runF(new yarnwrap.client.network.ClientConfigurationNetworkHandler(handler), new yarnwrap.client.MinecraftClient(client)); }

@Override
public void onConfigurationReady(ClientConfigurationNetworkHandler handler, MinecraftClient client) { runF(new yarnwrap.client.network.ClientConfigurationNetworkHandler(handler), new yarnwrap.client.MinecraftClient(client)); }

@Override
public void onConfigurationStart(ClientConfigurationNetworkHandler handler, MinecraftClient client) { runF(new yarnwrap.client.network.ClientConfigurationNetworkHandler(handler), new yarnwrap.client.MinecraftClient(client)); }

@Override
public void onLoginDisconnect(ClientLoginNetworkHandler handler, MinecraftClient client) { runF(new yarnwrap.client.network.ClientLoginNetworkHandler(handler), new yarnwrap.client.MinecraftClient(client)); }

@Override
public void onLoginStart(ClientLoginNetworkHandler handler, MinecraftClient client) { runF(new yarnwrap.client.network.ClientLoginNetworkHandler(handler), new yarnwrap.client.MinecraftClient(client)); }

@Override
public void onLoginQueryStart(ClientLoginNetworkHandler handler, MinecraftClient client) { runF(new yarnwrap.client.network.ClientLoginNetworkHandler(handler), new yarnwrap.client.MinecraftClient(client)); }

@Override
public void onPlayDisconnect(ClientPlayNetworkHandler handler, MinecraftClient client) { runF(new yarnwrap.client.network.ClientPlayNetworkHandler(handler), new yarnwrap.client.MinecraftClient(client)); }

@Override
public void onPlayInit(ClientPlayNetworkHandler handler, MinecraftClient client) { runF(new yarnwrap.client.network.ClientPlayNetworkHandler(handler), new yarnwrap.client.MinecraftClient(client)); }

@Override
public void onPlayReady(ClientPlayNetworkHandler handler, PacketSender sender, MinecraftClient client) { runF(new yarnwrap.client.network.ClientPlayNetworkHandler(handler), sender, new yarnwrap.client.MinecraftClient(client)); }

@Override
public boolean allowBlockDustTint(BlockState state, ClientWorld world, BlockPos pos) { Object res = runF(new yarnwrap.block.BlockState(state), new yarnwrap.client.world.ClientWorld(world), new yarnwrap.util.math.BlockPos(pos)); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowBlockDustTint)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public boolean allowCapeRender(PlayerEntityRenderState state) { Object res = runF(new yarnwrap.client.render.entity.state.PlayerEntityRenderState(state)); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowCapeRender)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public void afterEntities(WorldRenderContext context) { runF(context); }

@Override
public void afterSetup(WorldRenderContext context) { runF(context); }

@Override
public void afterTranslucent(WorldRenderContext context) { runF(context); }

@Override
public boolean beforeBlockOutline(WorldRenderContext context, HitResult hitResult) { Object res = runF(context, new yarnwrap.util.hit.HitResult(hitResult)); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (beforeBlockOutline)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public void beforeEntities(WorldRenderContext context) { runF(context); }

@Override
public boolean onBlockOutline(WorldRenderContext worldRenderContext, BlockOutlineContext blockOutlineContext) { Object res = runF(worldRenderContext, blockOutlineContext); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (onBlockOutline)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public void beforeDebugRender(WorldRenderContext context) { runF(context); }

@Override
public void onEnd(WorldRenderContext context) { runF(context); }

@Override
public void onLast(WorldRenderContext context) { runF(context); }

@Override
public void onStart(WorldRenderContext context) { runF(context); }

@Override
public void afterInit(MinecraftClient client, Screen screen, int scaledWidth, int scaledHeight) { runF(new yarnwrap.client.MinecraftClient(client), new yarnwrap.client.gui.screen.Screen(screen), scaledWidth, scaledHeight); }

@Override
public void afterRender(Screen screen, DrawContext drawContext, int mouseX, int mouseY, float tickDelta) { runF(new yarnwrap.client.gui.screen.Screen(screen), new yarnwrap.client.gui.DrawContext(drawContext), mouseX, mouseY, tickDelta); }

@Override
public void afterTick(Screen screen) { runF(new yarnwrap.client.gui.screen.Screen(screen)); }

@Override
public void beforeInit(MinecraftClient client, Screen screen, int scaledWidth, int scaledHeight) { runF(new yarnwrap.client.MinecraftClient(client), new yarnwrap.client.gui.screen.Screen(screen), scaledWidth, scaledHeight); }

@Override
public void beforeRender(Screen screen, DrawContext drawContext, int mouseX, int mouseY, float tickDelta) { runF(new yarnwrap.client.gui.screen.Screen(screen), new yarnwrap.client.gui.DrawContext(drawContext), mouseX, mouseY, tickDelta); }

@Override
public void beforeTick(Screen screen) { runF(new yarnwrap.client.gui.screen.Screen(screen)); }

@Override
public void onRemove(Screen screen) { runF(new yarnwrap.client.gui.screen.Screen(screen)); }

@Override
public boolean allowElytraFlight(LivingEntity entity) { Object res = runF(new yarnwrap.entity.LivingEntity(entity)); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowElytraFlight)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public boolean useCustomElytra(LivingEntity entity, boolean tickElytra) { Object res = runF(new yarnwrap.entity.LivingEntity(entity), tickElytra); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (useCustomElytra)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public ActionResult allowBed(LivingEntity entity, BlockPos sleepingPos, BlockState state, boolean vanillaResult) { Object res = runF(new yarnwrap.entity.LivingEntity(entity), new yarnwrap.util.math.BlockPos(sleepingPos), new yarnwrap.block.BlockState(state), vanillaResult); if (Undefined.isUndefined(res)) { return ActionResult.PASS; } else try { return (ActionResult) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (ActionResult) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowBed)\u00A77] \u00A7c" + e.toString()); return ActionResult.PASS; } }

@Override
public ActionResult allowNearbyMonsters(PlayerEntity player, BlockPos sleepingPos, boolean vanillaResult) { Object res = runF(new yarnwrap.entity.player.PlayerEntity(player), new yarnwrap.util.math.BlockPos(sleepingPos), vanillaResult); if (Undefined.isUndefined(res)) { return ActionResult.PASS; } else try { return (ActionResult) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (ActionResult) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowNearbyMonsters)\u00A77] \u00A7c" + e.toString()); return ActionResult.PASS; } }

@Override
public boolean allowResettingTime(PlayerEntity player) { Object res = runF(new yarnwrap.entity.player.PlayerEntity(player)); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowResettingTime)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public boolean allowSettingSpawn(PlayerEntity player, BlockPos sleepingPos) { Object res = runF(new yarnwrap.entity.player.PlayerEntity(player), new yarnwrap.util.math.BlockPos(sleepingPos)); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowSettingSpawn)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public ActionResult allowSleepTime(PlayerEntity player, BlockPos sleepingPos, boolean vanillaResult) { Object res = runF(new yarnwrap.entity.player.PlayerEntity(player), new yarnwrap.util.math.BlockPos(sleepingPos), vanillaResult); if (Undefined.isUndefined(res)) { return ActionResult.PASS; } else try { return (ActionResult) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (ActionResult) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowSleepTime)\u00A77] \u00A7c" + e.toString()); return ActionResult.PASS; } }

@Override
public 		PlayerEntity.SleepFailureReason allowSleep(PlayerEntity player, BlockPos sleepingPos) { Object res = runF(new yarnwrap.entity.player.PlayerEntity(player), new yarnwrap.util.math.BlockPos(sleepingPos)); if (Undefined.isUndefined(res)) { return null; } else try { return (		PlayerEntity.SleepFailureReason) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (		PlayerEntity.SleepFailureReason) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowSleep)\u00A77] \u00A7c" + e.toString()); return null; } }

@Override
public 		Direction modifySleepDirection(LivingEntity entity, BlockPos sleepingPos, Direction sleepingDirection) { Object res = runF(new yarnwrap.entity.LivingEntity(entity), new yarnwrap.util.math.BlockPos(sleepingPos), new yarnwrap.util.math.Direction(sleepingDirection)); if (Undefined.isUndefined(res)) { return sleepingDirection; } else try { return (		Direction) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (		Direction) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (modifySleepDirection)\u00A77] \u00A7c" + e.toString()); return sleepingDirection; } }

@Override
public 		Vec3d modifyWakeUpPosition(LivingEntity entity, BlockPos sleepingPos, BlockState bedState, Vec3d wakeUpPos) { Object res = runF(new yarnwrap.entity.LivingEntity(entity), new yarnwrap.util.math.BlockPos(sleepingPos), new yarnwrap.block.BlockState(bedState), new yarnwrap.util.math.Vec3d(wakeUpPos)); if (Undefined.isUndefined(res)) { return wakeUpPos; } else try { return (		Vec3d) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (		Vec3d) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (modifyWakeUpPosition)\u00A77] \u00A7c" + e.toString()); return wakeUpPos; } }

@Override
public boolean setBedOccupationState(LivingEntity entity, BlockPos sleepingPos, BlockState bedState, boolean occupied) { Object res = runF(new yarnwrap.entity.LivingEntity(entity), new yarnwrap.util.math.BlockPos(sleepingPos), new yarnwrap.block.BlockState(bedState), occupied); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (setBedOccupationState)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public void onStartSleeping(LivingEntity entity, BlockPos sleepingPos) { runF(new yarnwrap.entity.LivingEntity(entity), new yarnwrap.util.math.BlockPos(sleepingPos)); }

@Override
public void onStopSleeping(LivingEntity entity, BlockPos sleepingPos) { runF(new yarnwrap.entity.LivingEntity(entity), new yarnwrap.util.math.BlockPos(sleepingPos)); }

@Override
public void afterKilledOtherEntity(ServerWorld world, Entity entity, LivingEntity killedEntity) { runF(new yarnwrap.server.world.ServerWorld(world), new yarnwrap.entity.Entity(entity), new yarnwrap.entity.LivingEntity(killedEntity)); }

@Override
public void afterChangeWorld(Entity originalEntity, Entity newEntity, ServerWorld origin, ServerWorld destination) { runF(new yarnwrap.entity.Entity(originalEntity), new yarnwrap.entity.Entity(newEntity), new yarnwrap.server.world.ServerWorld(origin), new yarnwrap.server.world.ServerWorld(destination)); }

@Override
public void afterChangeWorld(ServerPlayerEntity player, ServerWorld origin, ServerWorld destination) { runF(new yarnwrap.server.network.ServerPlayerEntity(player), new yarnwrap.server.world.ServerWorld(origin), new yarnwrap.server.world.ServerWorld(destination)); }

@Override
public void afterDamage(LivingEntity entity, DamageSource source, float baseDamageTaken, float damageTaken, boolean blocked) { runF(new yarnwrap.entity.LivingEntity(entity), new yarnwrap.entity.damage.DamageSource(source), baseDamageTaken, damageTaken, blocked); }

@Override
public void afterDeath(LivingEntity entity, DamageSource damageSource) { runF(new yarnwrap.entity.LivingEntity(entity), new yarnwrap.entity.damage.DamageSource(damageSource)); }

@Override
public boolean allowDamage(LivingEntity entity, DamageSource source, float amount) { Object res = runF(new yarnwrap.entity.LivingEntity(entity), new yarnwrap.entity.damage.DamageSource(source), amount); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowDamage)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public boolean allowDeath(LivingEntity entity, DamageSource damageSource, float damageAmount) { Object res = runF(new yarnwrap.entity.LivingEntity(entity), new yarnwrap.entity.damage.DamageSource(damageSource), damageAmount); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowDeath)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public void onConversion(MobEntity previous, MobEntity converted, EntityConversionContext conversionContext) { runF(new yarnwrap.entity.mob.MobEntity(previous), new yarnwrap.entity.mob.MobEntity(converted), new yarnwrap.entity.conversion.EntityConversionContext(conversionContext)); }

@Override
public void afterRespawn(ServerPlayerEntity oldPlayer, ServerPlayerEntity newPlayer, boolean alive) { runF(new yarnwrap.server.network.ServerPlayerEntity(oldPlayer), new yarnwrap.server.network.ServerPlayerEntity(newPlayer), alive); }

@Override
public boolean allowDeath(ServerPlayerEntity player, DamageSource damageSource, float damageAmount) { Object res = runF(new yarnwrap.server.network.ServerPlayerEntity(player), new yarnwrap.entity.damage.DamageSource(damageSource), damageAmount); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowDeath)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public void copyFromPlayer(ServerPlayerEntity oldPlayer, ServerPlayerEntity newPlayer, boolean alive) { runF(new yarnwrap.server.network.ServerPlayerEntity(oldPlayer), new yarnwrap.server.network.ServerPlayerEntity(newPlayer), alive); }

@Override
public void afterBlockBreak(ClientWorld world, ClientPlayerEntity player, BlockPos pos, BlockState state) { runF(new yarnwrap.client.world.ClientWorld(world), new yarnwrap.client.network.ClientPlayerEntity(player), new yarnwrap.util.math.BlockPos(pos), new yarnwrap.block.BlockState(state)); }

@Override
public void onLoad(BlockEntity blockEntity, ServerWorld world) { runF(new yarnwrap.block.entity.BlockEntity(blockEntity), new yarnwrap.server.world.ServerWorld(world)); }

@Override
public void onUnload(BlockEntity blockEntity, ServerWorld world) { runF(new yarnwrap.block.entity.BlockEntity(blockEntity), new yarnwrap.server.world.ServerWorld(world)); }

@Override
public void onChunkGenerate(ServerWorld world, WorldChunk chunk) { runF(new yarnwrap.server.world.ServerWorld(world), new yarnwrap.world.chunk.WorldChunk(chunk)); }

// @Override
// public void onChunkLevelTypeChange(ServerWorld world, WorldChunk chunk, ChunkLevelType oldLevelType, ChunkLevelType newLevelType) { runF(new yarnwrap.server.world.ServerWorld(world), new yarnwrap.world.chunk.WorldChunk(chunk), new yarnwrap.server.world.ChunkLevelType(oldLevelType), new yarnwrap.server.world.ChunkLevelType(newLevelType)); }

@Override
public void onChunkLoad(ServerWorld world, WorldChunk chunk) { runF(new yarnwrap.server.world.ServerWorld(world), new yarnwrap.world.chunk.WorldChunk(chunk)); }

@Override
public void onChunkUnload(ServerWorld world, WorldChunk chunk) { runF(new yarnwrap.server.world.ServerWorld(world), new yarnwrap.world.chunk.WorldChunk(chunk)); }

@Override
public void onChange(LivingEntity livingEntity, EquipmentSlot equipmentSlot, ItemStack previousStack, ItemStack currentStack) { runF(new yarnwrap.entity.LivingEntity(livingEntity), new yarnwrap.entity.EquipmentSlot(equipmentSlot), new yarnwrap.item.ItemStack(previousStack), new yarnwrap.item.ItemStack(currentStack)); }

@Override
public void onLoad(Entity entity, ServerWorld world) { runF(new yarnwrap.entity.Entity(entity), new yarnwrap.server.world.ServerWorld(world)); }

@Override
public void onUnload(Entity entity, ServerWorld world) { runF(new yarnwrap.entity.Entity(entity), new yarnwrap.server.world.ServerWorld(world)); }

@Override
public void onAfterSave(MinecraftServer server, boolean flush, boolean force) { runF(new yarnwrap.server.MinecraftServer(server), flush, force); }

@Override
public void onBeforeSave(MinecraftServer server, boolean flush, boolean force) { runF(new yarnwrap.server.MinecraftServer(server), flush, force); }

@Override
public void endDataPackReload(MinecraftServer server, LifecycledResourceManager resourceManager, boolean success) { runF(new yarnwrap.server.MinecraftServer(server), new yarnwrap.resource.LifecycledResourceManager(resourceManager), success); }

@Override
public void onServerStarted(MinecraftServer server) { runF(new yarnwrap.server.MinecraftServer(server)); }

@Override
public void onServerStarting(MinecraftServer server) { runF(new yarnwrap.server.MinecraftServer(server)); }

@Override
public void onServerStopped(MinecraftServer server) { runF(new yarnwrap.server.MinecraftServer(server)); }

@Override
public void onServerStopping(MinecraftServer server) { runF(new yarnwrap.server.MinecraftServer(server)); }

@Override
public void startDataPackReload(MinecraftServer server, LifecycledResourceManager resourceManager) { runF(new yarnwrap.server.MinecraftServer(server), new yarnwrap.resource.LifecycledResourceManager(resourceManager)); }

@Override
public void onSyncDataPackContents(ServerPlayerEntity player, boolean joined) { runF(new yarnwrap.server.network.ServerPlayerEntity(player), joined); }

@Override
public void onEndTick(MinecraftServer server) { runF(new yarnwrap.server.MinecraftServer(server)); }

@Override
public void onEndTick(ServerWorld world) { runF(new yarnwrap.server.world.ServerWorld(world)); }

@Override
public void onStartTick(MinecraftServer server) { runF(new yarnwrap.server.MinecraftServer(server)); }

@Override
public void onStartTick(ServerWorld world) { runF(new yarnwrap.server.world.ServerWorld(world)); }

@Override
public void onWorldLoad(MinecraftServer server, ServerWorld world) { runF(new yarnwrap.server.MinecraftServer(server), new yarnwrap.server.world.ServerWorld(world)); }

@Override
public void onWorldUnload(MinecraftServer server, ServerWorld world) { runF(new yarnwrap.server.MinecraftServer(server), new yarnwrap.server.world.ServerWorld(world)); }

@Override
public void afterBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity blockEntity) { runF(new yarnwrap.world.World(world), new yarnwrap.entity.player.PlayerEntity(player), new yarnwrap.util.math.BlockPos(pos), new yarnwrap.block.BlockState(state), new yarnwrap.block.entity.BlockEntity(blockEntity)); }

@Override
public boolean beforeBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity blockEntity) { Object res = runF(new yarnwrap.world.World(world), new yarnwrap.entity.player.PlayerEntity(player), new yarnwrap.util.math.BlockPos(pos), new yarnwrap.block.BlockState(state), new yarnwrap.block.entity.BlockEntity(blockEntity)); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (beforeBlockBreak)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public void onBlockBreakCanceled(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity blockEntity) { runF(new yarnwrap.world.World(world), new yarnwrap.entity.player.PlayerEntity(player), new yarnwrap.util.math.BlockPos(pos), new yarnwrap.block.BlockState(state), new yarnwrap.block.entity.BlockEntity(blockEntity)); }

@Override
public 		ItemStack onPickItemFromBlock(ServerPlayerEntity player, BlockPos pos, BlockState state, boolean requestIncludeData) { Object res = runF(new yarnwrap.server.network.ServerPlayerEntity(player), new yarnwrap.util.math.BlockPos(pos), new yarnwrap.block.BlockState(state), requestIncludeData); if (Undefined.isUndefined(res)) { return null; } else try { return (		ItemStack) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (		ItemStack) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (onPickItemFromBlock)\u00A77] \u00A7c" + e.toString()); return null; } }

@Override
public 		ItemStack onPickItemFromEntity(ServerPlayerEntity player, Entity entity, boolean requestIncludeData) { Object res = runF(new yarnwrap.server.network.ServerPlayerEntity(player), new yarnwrap.entity.Entity(entity), requestIncludeData); if (Undefined.isUndefined(res)) { return null; } else try { return (		ItemStack) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (		ItemStack) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (onPickItemFromEntity)\u00A77] \u00A7c" + e.toString()); return null; } }

@Override
public void modify(ModifyContext context) { runF(context); }

@Override
public TriState allowEnchanting(RegistryEntry<Enchantment> enchantment, ItemStack target, EnchantingContext enchantingContext) { Object res = runF(enchantment, new yarnwrap.item.ItemStack(target), enchantingContext); if (Undefined.isUndefined(res)) { return TriState.DEFAULT; } else try { return (TriState) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (TriState) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowEnchanting)\u00A77] \u00A7c" + e.toString()); return TriState.DEFAULT; } }

@Override
public void modify(RegistryKey<Enchantment> key, Enchantment.Builder builder, EnchantmentSource source) { runF(key, builder, source); }

@Override
public void modifyEntries(FabricItemGroupEntries entries) { runF(entries); }

@Override
public void modifyEntries(ItemGroup group, FabricItemGroupEntries entries) { runF(new yarnwrap.item.ItemGroup(group), entries); }

@Override
public void onLootTablesLoaded(ResourceManager resourceManager, Registry<LootTable> lootRegistry) { runF(new yarnwrap.resource.ResourceManager(resourceManager), lootRegistry); }

@Override
public void modifyLootTable(RegistryKey<LootTable> key, LootTable.Builder tableBuilder, LootTableSource source, RegistryWrapper.WrapperLookup registries) { runF(key, tableBuilder, source, registries); }

@Override
public 		LootTable replaceLootTable(RegistryKey<LootTable> key, LootTable original, LootTableSource source, RegistryWrapper.WrapperLookup registries) { Object res = runF(key, new yarnwrap.loot.LootTable(original), source, registries); if (Undefined.isUndefined(res)) { return null; } else try { return (		LootTable) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (		LootTable) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (replaceLootTable)\u00A77] \u00A7c" + e.toString()); return null; } }

@Override
public boolean allowChatMessage(SignedMessage message, ServerPlayerEntity sender, MessageType.Parameters params) { Object res = runF(new yarnwrap.network.message.SignedMessage(message), new yarnwrap.server.network.ServerPlayerEntity(sender), params); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowChatMessage)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public boolean allowCommandMessage(SignedMessage message, ServerCommandSource source, MessageType.Parameters params) { Object res = runF(new yarnwrap.network.message.SignedMessage(message), new yarnwrap.server.command.ServerCommandSource(source), params); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowCommandMessage)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public boolean allowGameMessage(MinecraftServer server, Text message, boolean overlay) { Object res = runF(new yarnwrap.server.MinecraftServer(server), new yarnwrap.text.Text(message), overlay); if (Undefined.isUndefined(res)) { return true; } else try { return (boolean) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (boolean) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (allowGameMessage)\u00A77] \u00A7c" + e.toString()); return true; } }

@Override
public void onChatMessage(SignedMessage message, ServerPlayerEntity sender, MessageType.Parameters params) { runF(new yarnwrap.network.message.SignedMessage(message), new yarnwrap.server.network.ServerPlayerEntity(sender), params); }

@Override
public void onCommandMessage(SignedMessage message, ServerCommandSource source, MessageType.Parameters params) { runF(new yarnwrap.network.message.SignedMessage(message), new yarnwrap.server.command.ServerCommandSource(source), params); }

@Override
public void onGameMessage(MinecraftServer server, Text message, boolean overlay) { runF(new yarnwrap.server.MinecraftServer(server), new yarnwrap.text.Text(message), overlay); }

@Override
public void onStartTracking(Entity trackedEntity, ServerPlayerEntity player) { runF(new yarnwrap.entity.Entity(trackedEntity), new yarnwrap.server.network.ServerPlayerEntity(player)); }

@Override
public void onStopTracking(Entity trackedEntity, ServerPlayerEntity player) { runF(new yarnwrap.entity.Entity(trackedEntity), new yarnwrap.server.network.ServerPlayerEntity(player)); }

@Override
public void onChannelRegister(ServerConfigurationNetworkHandler handler, PacketSender sender, MinecraftServer server, List<Identifier> channels) { runF(new yarnwrap.server.network.ServerConfigurationNetworkHandler(handler), sender, new yarnwrap.server.MinecraftServer(server), channels); }

@Override
public void onChannelUnregister(ServerConfigurationNetworkHandler handler, PacketSender sender, MinecraftServer server, List<Identifier> channels) { runF(new yarnwrap.server.network.ServerConfigurationNetworkHandler(handler), sender, new yarnwrap.server.MinecraftServer(server), channels); }

@Override
public void onChannelRegister(ServerPlayNetworkHandler handler, PacketSender sender, MinecraftServer server, List<Identifier> channels) { runF(new yarnwrap.server.network.ServerPlayNetworkHandler(handler), sender, new yarnwrap.server.MinecraftServer(server), channels); }

@Override
public void onChannelUnregister(ServerPlayNetworkHandler handler, PacketSender sender, MinecraftServer server, List<Identifier> channels) { runF(new yarnwrap.server.network.ServerPlayNetworkHandler(handler), sender, new yarnwrap.server.MinecraftServer(server), channels); }

@Override
public void onSendConfiguration(ServerConfigurationNetworkHandler handler, MinecraftServer server) { runF(new yarnwrap.server.network.ServerConfigurationNetworkHandler(handler), new yarnwrap.server.MinecraftServer(server)); }

@Override
public void onConfigureDisconnect(ServerConfigurationNetworkHandler handler, MinecraftServer server) { runF(new yarnwrap.server.network.ServerConfigurationNetworkHandler(handler), new yarnwrap.server.MinecraftServer(server)); }

@Override
public void onLoginDisconnect(ServerLoginNetworkHandler handler, MinecraftServer server) { runF(new yarnwrap.server.network.ServerLoginNetworkHandler(handler), new yarnwrap.server.MinecraftServer(server)); }

@Override
public void onLoginInit(ServerLoginNetworkHandler handler, MinecraftServer server) { runF(new yarnwrap.server.network.ServerLoginNetworkHandler(handler), new yarnwrap.server.MinecraftServer(server)); }

@Override
public void onLoginStart(ServerLoginNetworkHandler handler, MinecraftServer server, LoginPacketSender sender, ServerLoginNetworking.LoginSynchronizer synchronizer) { runF(new yarnwrap.server.network.ServerLoginNetworkHandler(handler), new yarnwrap.server.MinecraftServer(server), sender, synchronizer); }

@Override
public void onPlayDisconnect(ServerPlayNetworkHandler handler, MinecraftServer server) { runF(new yarnwrap.server.network.ServerPlayNetworkHandler(handler), new yarnwrap.server.MinecraftServer(server)); }

@Override
public void onPlayInit(ServerPlayNetworkHandler handler, MinecraftServer server) { runF(new yarnwrap.server.network.ServerPlayNetworkHandler(handler), new yarnwrap.server.MinecraftServer(server)); }

@Override
public void onPlayReady(ServerPlayNetworkHandler handler, PacketSender sender, MinecraftServer server) { runF(new yarnwrap.server.network.ServerPlayNetworkHandler(handler), sender, new yarnwrap.server.MinecraftServer(server)); }

@Override
public 		Storage<FluidVariant> find(ContainerItemContext context) { Object res = runF(context); if (Undefined.isUndefined(res)) { return null; } else try { return (		Storage<FluidVariant>) res; } catch (Exception e) { try { Object step = ((org.mozilla.javascript.NativeJavaObject) res).unwrap(); return (		Storage<FluidVariant>) step.getClass().getField("wrapperContained").get(step); } catch (Exception _e) {} ws.siri.jscore.Core.log("\u00A77[\u00A7cCastError (find)\u00A77] \u00A7c" + e.toString()); return null; } }
}
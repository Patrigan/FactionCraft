package com.patrigan.faction_craft.network;

import com.patrigan.faction_craft.FactionCraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class NetworkHandler {
    public static final SimpleChannel INSTANCE = NetworkRegistry.ChannelBuilder.named(
            new ResourceLocation(FactionCraft.MODID, "network"))
            .clientAcceptedVersions("1"::equals)
            .serverAcceptedVersions("1"::equals)
            .networkProtocolVersion(() -> "1")
            .simpleChannel();

    protected static int PACKET_COUNTER = 0;

    public NetworkHandler() {
    }

    public static void init() {
//        INSTANCE.messageBuilder(MobEnchantmentMessage.class, 0)
//                .encoder(MobEnchantmentMessage::encode).decoder(MobEnchantmentMessage::decode)
//                .consumer(MobEnchantmentMessage::onPacketReceived)
//                .add();
    }

    public static int incrementAndGetPacketCounter() {
        return PACKET_COUNTER++;
    }
}

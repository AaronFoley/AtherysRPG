package com.atherys.rpg.config;

import com.atherys.core.utils.PluginConfig;
import com.google.inject.Singleton;
import ninja.leaping.configurate.objectmapping.Setting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Singleton
public class SkillGraphConfig extends PluginConfig {

    @Setting("root-skill")
    public SkillNodeConfig ROOT = new SkillNodeConfig();

    @Setting("skill-nodes")
    public Map<String, SkillNodeConfig> NODES = new HashMap<>();

    @Setting("skill-links")
    public List<SkillNodeLinkConfig> LINKS = new ArrayList<>();

    protected SkillGraphConfig() throws IOException {
        super("config/atherysrpg", "skill-graph.json");
    }
}

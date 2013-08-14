package org.elasticsearch.plugin.similarity.customer;

import org.elasticsearch.common.inject.Module;
import org.elasticsearch.index.similarity.CustomSimilarityProvider;
import org.elasticsearch.index.similarity.SimilarityModule;
import org.elasticsearch.plugins.AbstractPlugin;


public class CustomerSimilarityPlugin extends AbstractPlugin {

    @Override public String name() {
        return "customer-similarity";
    }


    @Override public String description() {
        return "customer similarity";
    }


    @Override public void processModule(Module module) {
        if (module instanceof SimilarityModule) {
        	SimilarityModule similarityModule = (SimilarityModule) module;
        	similarityModule.addSimilarity("customer-similarity", CustomSimilarityProvider.class);
        }
    }
}

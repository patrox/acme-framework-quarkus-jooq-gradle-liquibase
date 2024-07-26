package org.acme.jooq;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.conf.RenderNameCase;
import org.jooq.conf.RenderQuotedNames;
import org.jooq.conf.Settings;
import org.jooq.impl.*;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import javax.sql.DataSource;

/**
 * JooqContextFactory to create instances of context-scoped jooq dsl-contexts.
 */
@ApplicationScoped
public class JooqContextFactory {

    @Inject
    DataSource dataSource;

    public DSLContext createJooqContext() {
        try {
            return DSL.using(getConfiguration());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Configuration getConfiguration() {
        Configuration configuration = new DefaultConfiguration()
                .set(dataSource)
                .set(new Settings()
                        .withExecuteLogging(true)
                        .withRenderFormatted(true)
                        .withRenderCatalog(false)
                        .withRenderSchema(false)
                        .withMaxRows(Integer.MAX_VALUE)
                        .withRenderQuotedNames(RenderQuotedNames.EXPLICIT_DEFAULT_UNQUOTED)
                        .withRenderNameCase(RenderNameCase.LOWER_IF_UNQUOTED)
                        .withExecuteLogging(true)
                );
        configuration.set(new DefaultRecordListenerProvider(new JooqInsertListener()));
        return configuration;
    }
}

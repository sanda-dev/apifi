package dev.sanda.apifi.generator.entity;

public enum CRUDEndpoints {
    GET_PAGINATED_BATCH,
    GET_TOTAL_NON_ARCHIVED_COUNT,
    GET_BY_ID, GET_BATCH_BY_IDS,
    CREATE, BATCH_CREATE,
    UPDATE, BATCH_UPDATE,
    DELETE, BATCH_DELETE,
    ARCHIVE, BATCH_ARCHIVE,
    DE_ARCHIVE, BATCH_DE_ARCHIVE,
    GET_ARCHIVED_PAGINATED_BATCH,
    GET_TOTAL_ARCHIVED_COUNT
}

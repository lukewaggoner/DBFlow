package com.raizlabs.android.dbflow.structure.listener;

import android.support.annotation.NonNull;

import com.raizlabs.android.dbflow.structure.InternalAdapter;
import com.raizlabs.android.dbflow.structure.Model;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;

/**
 * Description: Marks a {@link Model} as subscribing to the {@link DatabaseStatement}
 * that is used to {@link Model#insert()} a model into the DB.
 */
public interface SQLiteStatementListener {

    /**
     * Called at the end of {@link InternalAdapter#bindToStatement(DatabaseStatement, Object)}
     * Perform a custom manipulation of the statement as willed.
     *
     * @param databaseStatement The statement from the {@link ModelAdapter}
     */
    void onBindToStatement(@NonNull DatabaseStatement databaseStatement);

    /**
     * Called at the end of {@link InternalAdapter#bindToInsertStatement(DatabaseStatement, Object)}
     * Perform a custom manipulation of the statement as willed.
     *
     * @param databaseStatement The insert statement from the {@link ModelAdapter}
     */
    void onBindToInsertStatement(@NonNull DatabaseStatement databaseStatement);

    /**
     * Called at the end of {@link InternalAdapter#bindToUpdateStatement(DatabaseStatement, Object)}
     * Perform a custom manipulation of the statement as willed.
     *
     * @param databaseStatement The insert statement from the {@link ModelAdapter}
     */
    void onBindToUpdateStatement(@NonNull DatabaseStatement databaseStatement);

    void onBindToDeleteStatement(@NonNull DatabaseStatement databaseStatement);
}

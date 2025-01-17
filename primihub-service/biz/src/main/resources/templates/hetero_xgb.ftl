{
    "roles": {
        "guest": [
            "Charlie"
        ],
        "host": [
            "Bob"
        ]
    },
    "common_params": {
        "model": "HeteroXGB",
        "task_name": "train",
        "num_tree": ${numTree!5},
        "max_depth": ${maxDepth!5},
        "reg_lambda": ${regLambda!1},
        "merge_gh": ${mergeGh!true},
        "ray_group": true,
        "sample_type": "random",
        "feature_sample": ${featureSample!true},
        "learning_rate":${learningRate!0.1},
        "gamma": ${gamma!0},
        "min_child_weight":${minChildWeight!5},
        "min_child_sample": ${minChildSample!1},
        "record": ${record!0},
        "encrypted_proto": "paillier",
        "sampling_stategy": "random",
        "samples_clip_size": 20000,
        "large_grads_ratio": 0.2,
        "small_grads_ratio": 0.2,
        "actors": 20,
        "metric_path": "${indicatorFileName}",
        "model_pred": "${predictFileName}"
    },
    "role_params": {
        "Bob": {
            "data_set": "${label_dataset}",
            "id": "id",
            "secure_bits": 112,
            "selected_column": null,
            "objective": "linear",
            "base_score": 0.5,
            "amplify_ratio": 8,
            "label": "y",
            "lookup_table": "${hostLookupTable}",
            "model_path": "${hostModelFileName}"
        },
        "Charlie": {
            "data_set": "${guest_dataset}",
            "id": "id",
            "model_path": "${guestModelFileName}",
            "selected_column": null,
            "lookup_table": "${guestLookupTable}",
            "label": null,
            "batch_size": 5
        }
    }
}
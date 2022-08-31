export interface CapacitorReadKeyPlugin {
    read(options: { key: string }): Promise<{ key: string }>;
}

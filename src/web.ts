import { WebPlugin } from '@capacitor/core';

import type { CapacitorReadKeyPlugin } from './definitions';

export class CapacitorReadKeyWeb extends WebPlugin implements CapacitorReadKeyPlugin {
  
    async read(options: { key: string }): Promise<{ key: string }> {
        console.log('VALUE', options);
        return options;
    }
}

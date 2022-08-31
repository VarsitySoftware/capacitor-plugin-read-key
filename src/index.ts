import { registerPlugin } from '@capacitor/core';

import type { CapacitorReadKeyPlugin } from './definitions';

const CapacitorReadKey = registerPlugin<CapacitorReadKeyPlugin>('CapacitorReadKey', {
  web: () => import('./web').then(m => new m.CapacitorReadKeyWeb()),
});

export * from './definitions';
export { CapacitorReadKey };

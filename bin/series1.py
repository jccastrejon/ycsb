#!/usr/bin/python

# Ugly hack to allow absolute import from the root folder
import sys, os
sys.path.insert(0, os.path.abspath('..'))
# The end of the ugly hack
from fabfile.series import run_test_series

db = 'basic'       # hardcoded
# db = sys.argv[1] # from command line
thresholds = map(lambda t: t * 1000, [100, 200, 0]) # 0 means infinity
# alternate 'A' and 'C' workloads, flatten them
seq = []
for d in map(lambda t: [('C', t), ('A', t)], thresholds):
    seq.extend(d)
print ('seq = %s' % seq)
run_test_series(db, seq)




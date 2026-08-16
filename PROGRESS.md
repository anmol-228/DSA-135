# Progress

Last updated: 2026-08-16

This file is a human-readable snapshot, updated only when real progress is
recorded — not a live view. The DSA Accountability app's own database is the
authoritative source for mastery/session state. See
[COMPLETED.md](COMPLETED.md) for the full evidence-backed breakdown and
`DSA135_HISTORICAL_COMPLETION_LEDGER.md` (in the DSA Accountability repo)
for exactly how each item was independently re-verified.

## App-tracked progress (flexible topic/session engine)

| Metric | Value |
|---|---:|
| Practice sessions built through the app | 0 |
| Problems solved (fresh Accepted, app-verified) | 0 |
| Local exercises completed | 2 |
| Revisions completed | 0 |
| Topics with any tracked completion | 1 / 41 (Java Conditionals) |

Two exercises are genuinely complete; everything else is genuinely zero. No
practice session has been built through the app's own session builder yet —
the two completions above predate it and were independently re-verified and
imported with full evidence (see below), not assumed.

## Historical work, independently re-verified and imported

Two local Java exercises were completed before the app switched from its
original day-based model to the current topic/session engine. Each was
re-compiled and re-run against the app's own real functional tests this
pass — not assumed from a commit message or a prior report — and only
imported into the app's own tracking because that re-verification genuinely
passed:

| Exercise | Topic | Commit | Re-verified | Imported |
|---|---|---|---|---|
| Even/Odd | Java Foundations — Conditionals | `54df245` | 4/4 functional tests PASS | Yes — dated to the real commit timestamp |
| Maximum of Three | Java Foundations — Conditionals | `527dedb` | 4/4 functional tests PASS | Yes — dated to the real commit timestamp |

Two exercises are genuinely NOT done yet, despite living under `Topics/` now
(moving a file does not mean it's solved — verified by re-running the real
compile + functional-test pipeline, not inferred from the file's presence):

- **Simple Calculator** (Java Foundations — Operators): real, non-skeleton
  effort that compiles, but fails all 4 functional tests on re-verification.
  The bug is real and specific: the code reads Scanner input as (number,
  number, operator), but the exercise expects (number, operator, number),
  so the second `nextInt()` call throws on a non-numeric token. Not fixed
  by this pass — left exactly as written so the user can finish it
  themselves; the app's own validation dialog will show this same failure.
- **Leap Year** (Java Foundations — Conditionals): still the unmodified
  starter skeleton. Not started.

## Curriculum-day log (historical, pre-topic-engine)

| Day | Topic | Original due date | Status |
|---:|---|---|---|
| 1 | Java Fundamentals I | 2026-08-15 | In progress (see above) |

See [CURRICULUM.md](CURRICULUM.md) for why this log stops at Day 1 and is not
being continued.
